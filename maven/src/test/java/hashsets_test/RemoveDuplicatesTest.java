package hashsets_test;
public class RemoveDuplicatesTest {
    public static void main(String[] args) {
        testRemoveDuplicates("hello world", "hel owrld");
        testRemoveDuplicates("banana", "ban");
        testRemoveDuplicates("programming", "progamin");
        testRemoveDuplicates("aabbcc", "abc");
        testRemoveDuplicates("", "");
    }

    private static void testRemoveDuplicates(String input, String expectedOutput) {
        String result = removeDuplicates(input);
        if (result.equals(expectedOutput)) {
            System.out.println("Test passed for input: \"" + input + "\"");
        } else {
            System.out.println("Test failed for input: \"" + input + "\"");
            System.out.println("Expected output: \"" + expectedOutput + "\", but got: \"" + result + "\"");
        }
    }

    private static String removeDuplicates(String inputString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}