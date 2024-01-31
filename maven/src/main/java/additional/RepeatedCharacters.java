public class RepeatedCharacters {
    public static void printRepeatedCharacters(String str) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character in the string
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        // Print characters with frequency greater than 1
        System.out.println("Repeated characters in the string:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ": " + charCount[i] + " times");
            }
        }
    }
}