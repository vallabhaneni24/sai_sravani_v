package test_lambdas;

import lambdas.StringFilter;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import static org.junit.Assert.assertEquals;

public class StringFilterTest {

    @Test
    public void testFilterStrings() {
        // Input list of strings
        List<String> stringList = Arrays.asList("Apple", "Banana", "Orange", "Avocado", "Grapes");

        // Lambda expression to filter out strings starting with "A"
        Predicate<String> startsWithA = s -> !s.startsWith("A");

        // Call the filter method
        List<String> filteredList = StringFilter.filterStrings(stringList, startsWithA);

        // Expected result after filtering
        List<String> expectedResult = Arrays.asList("Banana", "Orange", "Grapes");

        // Assert the filtered list matches the expected result
        assertEquals(expectedResult, filteredList);
    }
}