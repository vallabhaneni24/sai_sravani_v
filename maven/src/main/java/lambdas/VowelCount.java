package lambdas;

import java.util.Arrays;

public class VowelCount {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "grape", "kiwi"};

        // Print strings containing vowels and the number of vowels using streams and lambdas
        Arrays.stream(strings)
                .filter(s -> s.matches(".*[aeiouAEIOU].*")) // Corrected regex pattern
                .forEach(s -> {
                    long vowelCount = s.chars()
                            .mapToObj(c -> (char) c)
                            .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                            .count(); // Count vowels in each string
                    System.out.println(s + " - Number of vowels: " + vowelCount);
                });
    }
}
