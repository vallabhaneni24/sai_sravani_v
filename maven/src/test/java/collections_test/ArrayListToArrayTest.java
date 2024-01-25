package collections_test;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertArrayEquals;
import collections.ArrayListToArray;

public class ArrayListToArrayTest {

    @Test
    public void testConvertToArray() {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        // Create an instance of the class to test
        ArrayListToArray converter = new ArrayListToArray();

        // Test converting ArrayList to array
        String[] expectedArray = {"Apple", "Banana", "Orange"};
        String[] actualArray = converter.convertToArray(stringList);

        // Verify the converted array
        assertArrayEquals(expectedArray, actualArray);
    }
}