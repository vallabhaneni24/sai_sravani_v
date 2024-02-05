package additional;

import java.util.ArrayList;
import java.util.List;

public class Repeated {

    public List<Character> findRepeatedCharacters(String input) {
        List<Character> repeatedCharacters = new ArrayList<>();
        List<Character> uniqueCharacters = new ArrayList<>();
        List<Character> seenCharacters = new ArrayList<>();

        for (char ch : input.toCharArray()) {
            if (uniqueCharacters.contains(ch)) {
                if (!seenCharacters.contains(ch)) {
                    repeatedCharacters.add(ch);
                    seenCharacters.add(ch);
                }
            } else {
                uniqueCharacters.add(ch);
            }
        }

        return repeatedCharacters;
    }
}