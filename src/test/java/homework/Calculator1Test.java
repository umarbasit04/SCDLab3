package homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Calculator1Test {

    private Calculator1 calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculator1();
    }

    @AfterEach
    public void tearDown() {
        calc = null;
    }

    @Test
    public void testAdd_NormalCase() {
        assertEquals(7, calc.add(3, 4));
    }

    @Test
    public void testSubtract_NormalCase() {
        assertEquals(-1, calc.subtract(3, 4));
    }

    @Test
    public void testMultiply_NormalCase() {
        assertEquals(12, calc.multiply(3, 4));
    }

    @Test
    public void testDivide_NormalCase() {
        assertEquals(2.0, calc.divide(8, 4), 0.001);
    }

    @Test
    public void testDivide_ByZero_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }

    @Test
    public void testPower_NormalCase() {
        assertEquals(8.0, calc.power(2, 3), 0.001);
    }

    @Test
    public void testPower_BoundaryExponentZero() {
        assertEquals(1.0, calc.power(5, 0), 0.001);
    }

    @Test
    public void testModulus_NormalCase() {
        assertEquals(1, calc.modulus(7, 2));
    }

    @Test
    public void testModulus_ByZero_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calc.modulus(7, 0));
    }
}
