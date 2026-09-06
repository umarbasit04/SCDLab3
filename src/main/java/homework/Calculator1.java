package homework;

/**
 * Homework 1: Enhanced Calculator.
 *
 * NOTE: The lab handout refers to "extending the in-lab Calculator1 class",
 * but no earlier Calculator1 implementation was provided in this handout.
 * A standard basic calculator (add, subtract, multiply, divide) was assumed
 * as the starting point, then power() and modulus() were added as required.
 * Flagging this assumption here and in the report rather than inventing it silently.
 */
public class Calculator1 {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public double power(int base, int exp) {
        return Math.pow(base, exp);
    }

    public int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot compute modulus with b = 0");
        }
        return a % b;
    }
}
