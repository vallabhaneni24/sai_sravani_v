package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

    public String[] convertToArray(ArrayList<String> stringList) {
        // Convert ArrayList to array
        String[] stringArray = new String[stringList.size()];
        stringList.toArray(stringArray);
        return stringArray;
    }

    public static void main(String[] args) {
        // Example usage
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Orange");

        ArrayListToArray converter = new ArrayListToArray();

        // Convert ArrayList to array
        String[] stringArray = converter.convertToArray(strings);

        // Print the array
        System.out.println("Array elements:");
        System.out.println(Arrays.toString(stringArray));
    }
}