package collections;

import java.util.ArrayList;

public class ArrayListTraversal {

    public void traverseWithForLoop(ArrayList<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }

    public void traverseWithEnhancedForLoop(ArrayList<String> stringList) {
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
    }

    public static void main(String[] args) {
        // Example usage
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        ArrayListTraversal arrayListTraversal = new ArrayListTraversal();

        System.out.println("Traversing using for loop:");
        arrayListTraversal.traverseWithForLoop(fruits);

        System.out.println("\nTraversing using enhanced for loop:");
        arrayListTraversal.traverseWithEnhancedForLoop(fruits);
    }
}