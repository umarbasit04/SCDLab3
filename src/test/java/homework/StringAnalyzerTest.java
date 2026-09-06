package homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringAnalyzerTest {

    private final StringAnalyzer analyzer = new StringAnalyzer();

    @Test
    @DisplayName("Palindrome check: simple lowercase word returns true")
    public void testIsPalindrome_SimpleTrue() {
        assertTrue(analyzer.isPalindrome("level"));
    }

    @Test
    @DisplayName("Palindrome check: case-insensitive input returns true")
    public void testIsPalindrome_CaseInsensitive() {
        assertTrue(analyzer.isPalindrome("Madam"));
    }

    @Test
    @DisplayName("Palindrome check: null input returns false")
    public void testIsPalindrome_NullInput() {
        assertFalse(analyzer.isPalindrome(null));
    }

    @Test
    @DisplayName("Palindrome check: empty string returns false")
    public void testIsPalindrome_EmptyInput() {
        assertFalse(analyzer.isPalindrome(""));
    }

    @Test
    @DisplayName("Vowel count: mixed-case sentence")
    public void testCountVowels_NormalCase() {
        assertEquals(2, analyzer.countVowels("Hello"));
    }

    @Test
    @DisplayName("Vowel count: no vowels present")
    public void testCountVowels_NoVowels() {
        assertEquals(0, analyzer.countVowels("xyz"));
    }

    @Test
    @DisplayName("Vowel count: null input returns 0")
    public void testCountVowels_NullInput() {
        assertEquals(0, analyzer.countVowels(null));
    }

    @Test
    @DisplayName("Anagram check: case-insensitive true case")
    public void testIsAnagram_True() {
        assertTrue(analyzer.isAnagram("Listen", "Silent"));
    }

    @Test
    @DisplayName("Anagram check: false case")
    public void testIsAnagram_False() {
        assertFalse(analyzer.isAnagram("hello", "world"));
    }

    @Test
    @DisplayName("Anagram check: null input returns false")
    public void testIsAnagram_NullInput() {
        assertFalse(analyzer.isAnagram(null, "test"));
    }
}
