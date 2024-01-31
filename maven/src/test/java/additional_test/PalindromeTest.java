package additional_test;

public class PalindromeTest {
    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {"racecar", "level", "hello", "A man, a plan, a canal, Panama!", "12321"};

        for (String testString : testStrings) {
            if (Palindrome.isPalindrome(testString)) {
                System.out.println(testString + " is a palindrome.");
            } else {
                System.out.println(testString + " is not a palindrome.");
            }
        }
    }
}