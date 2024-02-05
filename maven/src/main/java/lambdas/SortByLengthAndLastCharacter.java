package lambdas;

import java.util.Arrays;

public class SortByLengthAndLastCharacter {
    public static String[] sortByLengthAndLastCharacter(String[] strings) {
        Arrays.sort(strings, (s1, s2) -> {
            if (s1.length() != s2.length()) {
                return Integer.compare(s1.length(), s2.length());
            } else {
                return s1.compareTo(s2);
            }
        });
        return strings;
    }
}