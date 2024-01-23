import org.junit.Test;
import static org.junit.Assert.assertEquals;
import strings.NumberOfVowels;

public class NumberOfVowelsTest {

    @Test
    public void testVowelCount() {
        String name = "Anusha";
        int result = NumberOfVowels.countVowels(name);
        assertEquals(3, result);
    }

    @Test
    public void testVowelCountWithEmptyString() {
        String name = "";
        int result = NumberOfVowels.countVowels(name);
        assertEquals(0, result);
    }

    @Test
    public void testVowelCountWithNoVowels() {
        String name = "BCDFGH";
        int result = NumberOfVowels.countVowels(name);
        assertEquals(0, result);
    }

    @Test
    public void testVowelCountWithUpperCase() {
        String name = "AEIOU";
        int result = NumberOfVowels.countVowels(name);
        assertEquals(5, result);
    }
}