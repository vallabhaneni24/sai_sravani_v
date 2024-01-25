package collections;
import java.util.ArrayList;
public class RemoveArrayListItem {
    public void removeLastElement(ArrayList<String> stringList) {
        // Check if the list is not empty
        if (!stringList.isEmpty()) {
            // Remove the last element
            stringList.remove(stringList.size() - 1);
        } else {
            System.out.println("ArrayList is empty. Cannot remove the last element.");
        }
    }

}