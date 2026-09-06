package homework;

/**
 * Homework 3: String analysis utility - palindrome check, vowel counting,
 * and anagram check.
 */
public class StringAnalyzer {

    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        String clean = s.replaceAll("[^A-Za-z]", "").toLowerCase();
        return new StringBuilder(clean).reverse().toString().equals(clean);
    }

    public int countVowels(String s) {
        if (s == null) {
            return 0;
        }
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        String clean1 = s1.replaceAll("[^A-Za-z]", "").toLowerCase();
        String clean2 = s2.replaceAll("[^A-Za-z]", "").toLowerCase();
        if (clean1.length() != clean2.length()) {
            return false;
        }
        char[] arr1 = clean1.toCharArray();
        char[] arr2 = clean2.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        return java.util.Arrays.equals(arr1, arr2);
    }
}
