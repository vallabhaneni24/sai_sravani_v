package test_lambdas;

import lambdas.MathOperation;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdditionLambda() {
        // Lambda expression for addition
        MathOperation addition = (a, b) -> a + b;

        // Test addition operation
        int result = addition.operate(5, 3);
        assertEquals(8, result);
    }
}