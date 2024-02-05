package test_lambdas;

import lambdas.PositiveIntegerSum;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class PositiveIntegerSumTest {

    @Test
    public void testSumOfSquares() {
        // Input list of integers
        List<Integer> inputList = Arrays.asList(1, 2, 3, -4, 5, -6, 7, 8, -9, 10);

        // Call the sumOfSquares method
        int sum = PositiveIntegerSum.sumOfSquares(inputList);

        // Expected result after summing squares of positive integers
        int expectedResult = 1 + 4 + 9 + 25 + 49 + 64 + 100;

        // Assert the sum matches the expected result
        assertEquals(expectedResult, sum);
    }
}