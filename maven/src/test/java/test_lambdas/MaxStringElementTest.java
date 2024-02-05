package test_lambdas;

import lambdas.MaxStringElement;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class MaxStringElementTest {

    @Test
    public void testFindMax() {
        // Input list of strings
        List<String> inputList = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Call the findMax method
        String maxElement = MaxStringElement.findMax(inputList);

        // Expected maximum element based on natural sorting order
        String expectedMaxElement = "orange";

        // Assert the maximum element matches the expected result
        assertEquals(expectedMaxElement, maxElement);
    }
}