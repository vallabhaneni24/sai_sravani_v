package lambdas;

import java.util.List;

public class MaxStringElement {

    public static String findMax(List<String> inputList) {
        return inputList.stream()
                .max(String::compareTo) // Find maximum element based on natural sorting order
                .orElse(null);          // Return null if the list is empty
    }
}