package labtasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TimerUtilTest {

    private final TimerUtil timer = new TimerUtil();

    @Test
    public void testSecondsBetween_NormalCase() {
        assertEquals(15, timer.secondsBetween(10, 25));
    }

    @Test
    public void testSecondsBetween_BoundaryZero() {
        assertEquals(0, timer.secondsBetween(0, 0));
    }

    @Test
    public void testSecondsBetween_InvalidInput_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> timer.secondsBetween(20, 10));
    }
}
