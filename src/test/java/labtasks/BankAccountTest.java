package labtasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    public void testDeposit_Positive_IncreasesBalance() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        assertEquals(100.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw_Valid_DecreasesBalance() {
        BankAccount account = new BankAccount();
        account.deposit(200);
        account.withdraw(50);
        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw_BeyondBalance_ThrowsIllegalStateException() {
        BankAccount account = new BankAccount();
        account.deposit(50);
        assertThrows(IllegalStateException.class, () -> account.withdraw(100));
    }

    @Test
    public void testDeposit_Negative_ThrowsIllegalArgumentException() {
        BankAccount account = new BankAccount();
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10));
    }
}
