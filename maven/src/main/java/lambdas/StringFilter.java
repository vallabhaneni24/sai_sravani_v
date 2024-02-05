package lambdas;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilter {

    public static List<String> filterStrings(List<String> inputList, Predicate<String> predicate) {
        return inputList.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}