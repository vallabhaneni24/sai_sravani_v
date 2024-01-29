package hashsets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public void demonstrateHashSet() {
        // Create a HashSet of Strings
        HashSet<String> stringSet = new HashSet<>();

        // Add 10 strings to the HashSet
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Grapes");
        stringSet.add("Mango");
        stringSet.add("Pineapple");
        stringSet.add("Strawberry");
        stringSet.add("Watermelon");
        stringSet.add("Peach");
        stringSet.add("Kiwi");

        // Iterate using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Iterate using for loop
        System.out.println("\nIterating using for loop:");
        Object[] stringArray = stringSet.toArray();
        for (int i = 0; i < stringArray.length; i++) {
            String element = (String) stringArray[i];
            System.out.println(element);
        }

        // Iterate using enhanced for loop
        System.out.println("\nIterating using enhanced for loop:");
        for (String element : stringSet) {
            System.out.println(element);
        }
    }
}