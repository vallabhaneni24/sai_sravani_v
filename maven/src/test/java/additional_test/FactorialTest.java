package additional;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void testFactorial() {
        // Test cases
        int[] testNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedResults = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800};

        // Test the factorial method
        for (int i = 0; i < testNumbers.length; i++) {
            int result = Factorial.factorial(testNumbers[i]);
            assertEquals("Factorial calculation failed for: " + testNumbers[i], expectedResults[i], result);
        }
    }
}