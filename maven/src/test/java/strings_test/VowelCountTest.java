package strings_test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import strings.VowelCount;

public class VowelCountTest {

    @Test
    public void testVowelCount() {
        String name = "Anusha";
        int result = VowelCount.countVowels(name);
        assertEquals(3, result);
    }

    @Test
    public void testVowelCountWithEmptyString() {
        String name = "";
        int result = VowelCount.countVowels(name);
        assertEquals(0, result);
    }

    @Test
    public void testVowelCountWithNoVowels() {
        String name = "BCDFGH";
        int result = VowelCount.countVowels(name);
        assertEquals(0, result);
    }

    @Test
    public void testVowelCountWithUpperCase() {
        String name = "AEIOU";
        int result = VowelCount.countVowels(name);
        assertEquals(5, result);
    }
}