package lambdas;

import java.util.List;

public class PositiveIntegerSum {

    public static int sumOfSquares(List<Integer> inputList) {
        return inputList.stream()
                .filter(n -> n > 0)            // Filter out positive integers
                .mapToInt(n -> n * n)          // Square each positive integer
                .sum();                        // Sum of squared positive integers
    }
}