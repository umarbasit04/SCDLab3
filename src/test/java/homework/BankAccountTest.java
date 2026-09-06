package homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountTest {

    @Test
    public void testDeposit_Valid_IncreasesBalance() {
        BankAccount account = new BankAccount();
        account.deposit(150);
        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test
    public void testDeposit_Negative_ThrowsException() {
        BankAccount account = new BankAccount();
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-20));
    }

    @Test
    public void testWithdraw_Overdraft_ThrowsException() {
        BankAccount account = new BankAccount();
        account.deposit(50);
        assertThrows(IllegalStateException.class, () -> account.withdraw(100));
    }

    @Test
    public void testWithdraw_BalanceBelow100_BecomesInactive() {
        BankAccount account = new BankAccount();
        account.deposit(150);
        account.withdraw(100); // balance becomes 50
        assertFalse(account.isActive());
    }

    @Test
    public void testWithdraw_BalanceStaysAbove100_RemainsActive() {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(100); // balance becomes 400
        assertTrue(account.isActive());
    }
}
