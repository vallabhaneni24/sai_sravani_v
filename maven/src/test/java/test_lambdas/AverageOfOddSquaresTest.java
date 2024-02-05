package test_lambdas;

import lambdas.AverageOfOddSquares;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AverageOfOddSquaresTest {

    @Test
    public void testAverageOfOddSquares() {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double expected = (1.0 + 9.0 + 25.0 + 49.0 + 81.0) / 5; // Expected average: (1^2 + 3^2 + 5^2 + 7^2 + 9^2) / 5 = 165.0

        double average = AverageOfOddSquares.calculateAverageOfOddSquares(numbers);

        assertEquals(expected, average, 0.001);
    }
}