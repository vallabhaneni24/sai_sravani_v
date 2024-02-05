package lambdas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {

    public static Map<Integer, List<String>> groupByLength(List<String> inputList) {
        return inputList.stream()
                .collect(Collectors.groupingBy(String::length)); // Group strings by their length
    }
}