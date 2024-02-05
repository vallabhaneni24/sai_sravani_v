package lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> inputList) {
        return inputList.stream()
                .distinct()                  // Remove duplicate elements
                .collect(Collectors.toList());
    }
}