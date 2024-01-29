package hashsets;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String inputString) {
        // Using LinkedHashSet to maintain the order of characters
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

        // Convert the string to character array
        char[] charArray = inputString.toCharArray();

        // Add each character to the LinkedHashSet
        for (char c : charArray) {
            uniqueChars.add(c);
        }

        // Construct the resulting string without duplicates
        StringBuilder result = new StringBuilder();
        for (Character character : uniqueChars) {
            result.append(character);
        }

        return result.toString();
    }
}