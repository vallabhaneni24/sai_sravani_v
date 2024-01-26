package maps;
import java.util.HashMap;

public class CharacterCounter {
    public static void main(String[] args) {
        String inputString = "test string";
        printCharacterCounts(inputString);
    }

    public static void printCharacterCounts(String inputString) {
        // Create a HashMap to store characters and their counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character in the input string
        for (char c : inputString.toCharArray()) {
            charCountMap.put(c, charCountMap.containsKey(c) ? charCountMap.get(c) + 1 : 1);
        }

        // Print the distinct characters and their counts
        System.out.print("Output: ");
        for (char c : inputString.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                System.out.print(c + "-" + charCountMap.get(c) + ", ");
                charCountMap.remove(c); // Remove the character from the map to avoid duplicate printing
            }
        }
    }
}