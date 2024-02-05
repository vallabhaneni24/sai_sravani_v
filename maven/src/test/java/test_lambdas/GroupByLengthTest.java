package test_lambdas;

import lambdas.GroupByLength;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GroupByLengthTest {

    @Test
    public void testGroupByLength() {
        // Input list of strings
        List<String> inputList = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "pear");

        // Call the groupByLength method
        Map<Integer, List<String>> result = GroupByLength.groupByLength(inputList);

        // Expected result after grouping by length
        Map<Integer, List<String>> expectedResult = new HashMap<>();
        expectedResult.put(5, Arrays.asList("apple", "grape"));
        expectedResult.put(6, Arrays.asList("banana", "orange"));
        expectedResult.put(4, Arrays.asList("kiwi", "pear"));

        // Assert the result matches the expected result
        assertEquals(expectedResult, result);
    }
}