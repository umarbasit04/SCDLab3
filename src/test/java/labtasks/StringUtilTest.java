package labtasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilTest {

    private final StringUtil util = new StringUtil();

    @Test
    public void testIsPalindrome_SimpleTrue() {
        assertTrue(util.isPalindrome("madam"));
    }

    @Test
    public void testIsPalindrome_CaseInsensitiveTrue() {
        assertTrue(util.isPalindrome("RaceCar"));
    }

    @Test
    public void testIsPalindrome_NotAPalindrome() {
        assertFalse(util.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindrome_NullInput() {
        assertFalse(util.isPalindrome(null));
    }

    // NOTE: With the implementation given in the lab handout, an empty string
    // is technically a palindrome (it reads the same reversed), so this returns
    // true, not false as the lab's "test ideas" list suggests. See report /
    // reflection for this discrepancy — flagged rather than silently changed.
    @Test
    public void testIsPalindrome_EmptyString() {
        assertTrue(util.isPalindrome(""));
    }
}
