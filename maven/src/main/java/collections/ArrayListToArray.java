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


}