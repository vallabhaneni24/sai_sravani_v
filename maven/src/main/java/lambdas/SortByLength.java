package lambdas;

import java.util.Arrays;

public class SortByLength {
    public static String[] sortByLength(String[] strings) {
        Arrays.sort(strings, (s1, s2) -> s1.length() - s2.length());
        return strings;
    }
}