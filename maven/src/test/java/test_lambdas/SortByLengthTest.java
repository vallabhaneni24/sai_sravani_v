package test_lambdas;

import lambdas.SortByLength;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SortByLengthTest {

    @Test
    public void testSortByLength() {
        String[] strings = {"banana", "apple", "grape", "orange", "kiwi"};
        String[] expected = {"kiwi", "apple", "grape", "banana", "orange"};

        String[] result = SortByLength.sortByLength(strings);

        assertArrayEquals(expected, result);
    }
}