package labtasks;

/**
 * Lab Task 3: String utility - checks whether a string is a palindrome.
 */
public class StringUtil {

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        String clean = s.replaceAll("[^A-Za-z]", "").toLowerCase();
        return new StringBuilder(clean).reverse().toString().equals(clean);
    }
}
