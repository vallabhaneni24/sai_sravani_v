package exceptions;

public class StringToIntConverter {
    public static int convertToInt(String input) throws NumberFormatException {
        return Integer.parseInt(input);
    }
}