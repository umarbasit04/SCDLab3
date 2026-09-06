package labtasks;

/**
 * Lab Task 2: Simple bank account with deposit/withdraw rules.
 */
public class BankAccount {

    private double balance;

    public void deposit(double amt) {
        if (amt < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative");
        }
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt > balance) {
            throw new IllegalStateException("Insufficient balance for withdrawal");
        }
        balance -= amt;
    }

    public double getBalance() {
        return balance;
    }
}
