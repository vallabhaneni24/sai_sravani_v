package test_lambdas;

import lambdas.Capitalize;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class CapitalizeTest {

    @Test
    public void testCapitalizeAndSort() {
        String[] strings = {"apple", "banana", "orange", "grape", "kiwi"};
        String[] expected = {"Apple", "Banana", "Grape", "Kiwi", "Orange"};

        String[] result = Capitalize.capitalizeAndSort(strings);

        assertArrayEquals(expected, result);
    }
}