package homework;

/**
 * Homework 2: Bank account with an additional business rule - the account
 * becomes inactive if its balance drops below 100 after a withdrawal.
 */
public class BankAccount {

    private double balance;
    private boolean active = true;

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
        if (balance < 100) {
            active = false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }
}
