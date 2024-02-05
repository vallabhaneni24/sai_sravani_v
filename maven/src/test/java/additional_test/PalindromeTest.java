package additional;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PalindromeTest {

    @Test
    public void testIsPalindrome() {
        // Test cases
        String[] palindromes = {"racecar", "level", "A man, a plan, a canal, Panama!", "12321"};
        String[] nonPalindromes = {"hello", "world", "12345"};

        // Test palindromes
        for (String palindrome : palindromes) {
            assertTrue("'" + palindrome + "' should be a palindrome", Palindrome.isPalindrome(palindrome));
        }

        // Test non-palindromes
        for (String nonPalindrome : nonPalindromes) {
            assertFalse("'" + nonPalindrome + "' should not be a palindrome", Palindrome.isPalindrome(nonPalindrome));
        }
    }
}