package test_additional;

import additional.Repeated;

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RepeatedTest {

    @Test
    public void testFindRepeatedCharacters() {
        Repeated finder = new Repeated();

        // Test cases
        // Test case 1: Empty string
        String input1 = "";
        List<Character> result1 = finder.findRepeatedCharacters(input1);
        assertTrue("Expected no repeated characters in an empty string", result1.isEmpty());

        // Test case 2: String with no repeated characters
        String input2 = "abcde";
        List<Character> result2 = finder.findRepeatedCharacters(input2);
        assertTrue("Expected no repeated characters in 'abcde'", result2.isEmpty());

        // Test case 3: String with all characters repeated
        String input3 = "aaaa";
        List<Character> result3 = finder.findRepeatedCharacters(input3);
        List<Character> expected3 = new ArrayList<>();
        expected3.add('a');
        assertEquals(expected3, result3);


    }
}