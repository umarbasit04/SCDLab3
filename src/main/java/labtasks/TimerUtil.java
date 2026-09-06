package labtasks;

/**
 * Lab Task 4: Computes elapsed seconds between a start and end time.
 */
public class TimerUtil {

    public int secondsBetween(int start, int end) {
        if (end < start) {
            throw new IllegalArgumentException("End < start");
        }
        return end - start;
    }
}
