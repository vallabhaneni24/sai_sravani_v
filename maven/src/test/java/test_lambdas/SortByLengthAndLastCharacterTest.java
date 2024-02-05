package test_lambdas;

import lambdas.SortByLengthAndLastCharacter;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

public class SortByLengthAndLastCharacterTest {

    @Test
    public void testSortByLengthAndLastCharacter() {
        String[] strings = {"banana", "apple", "grape", "orange", "kiwi"};
        String[] expected = {"apple", "banana", "grape", "kiwi", "orange"};

        String[] result = SortByLengthAndLastCharacter.sortByLengthAndLastCharacter(strings);

        Arrays.sort(expected);
        Arrays.sort(result);

        assertArrayEquals(expected, result);
    }
}