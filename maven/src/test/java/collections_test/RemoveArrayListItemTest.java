package collections_test;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import collections.RemoveArrayListItem;
public class RemoveArrayListItemTest {

    @Test
    public void testRemoveLastElement() {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Create an instance of the class to test
        RemoveArrayListItem removeLastElement = new RemoveArrayListItem();

        // Test removing the last element
        removeLastElement.removeLastElement(stringList);
        assertEquals("[Apple, Banana, Orange]", stringList.toString());

        // Test removing the last element from an empty list
        stringList.clear();
        removeLastElement.removeLastElement(stringList);
        assertEquals("[]", stringList.toString());
    }
}