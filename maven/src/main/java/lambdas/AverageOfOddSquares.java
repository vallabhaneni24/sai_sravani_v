package lambdas;

import java.util.Arrays;

public class AverageOfOddSquares {
    public static double calculateAverageOfOddSquares(Integer[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0) // Filter odd numbers
                .mapToDouble(n -> Math.pow(n, 2)) // Square each odd number
                .average() // Calculate the average
                .orElse(0); // If there are no odd numbers, return 0
    }
}