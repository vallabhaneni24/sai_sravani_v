package test_lambdas;

import lambdas.RemoveDuplicates;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        // Input list of integers with duplicates
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6, 7, 1);

        // Call the removeDuplicates method
        List<Integer> result = RemoveDuplicates.removeDuplicates(inputList);

        // Expected result after removing duplicates
        List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // Assert the result matches the expected result
        assertEquals(expectedResult, result);
    }
}