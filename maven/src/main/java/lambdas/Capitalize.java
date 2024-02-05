package lambdas;

import java.util.Arrays;

public class Capitalize {
    public static String[] capitalizeAndSort(String[] strings) {
        return Arrays.stream(strings)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .sorted()
                .toArray(String[]::new);
    }
}