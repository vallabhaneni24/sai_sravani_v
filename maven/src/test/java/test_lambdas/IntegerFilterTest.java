package test_lambdas;

import lambdas.IntegerFilter;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class IntegerFilterTest {

    @Test
    public void testFilterAndDouble() {
        // Input list of integers
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Call the filterAndDouble method
        List<Integer> filteredAndDoubledList = IntegerFilter.filterAndDouble(inputList);

        // Expected result after filtering and doubling
        List<Integer> expectedResult = Arrays.asList(2, 6, 10, 14, 18);

        // Assert the filtered and doubled list matches the expected result
        assertEquals(expectedResult, filteredAndDoubledList);
    }
}