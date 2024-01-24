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
    public static void main(String[] args) {
        // Example usage
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        RemoveArrayListItem removeLastElement = new RemoveArrayListItem();

        System.out.println("Before removal: " + fruits);
        removeLastElement.removeLastElement(fruits);
        System.out.println("After removal: " + fruits);
    }
}