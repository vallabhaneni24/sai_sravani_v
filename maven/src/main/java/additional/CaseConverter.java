package additional;

public class CaseConverter {
    public static String convertCase(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c); // Leave non-alphabetic characters unchanged
            }
        }

        return result.toString();
    }
}