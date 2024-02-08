package exceptions_test;

import exceptions.StringToIntConverter;

public class StringToIntConverterTest {
    public static void main(String[] args) {
        String[] inputs = {"23", "45.67", "test", "123f"};

        for (String input : inputs) {
            try {
                int result = StringToIntConverter.convertToInt(input);
                System.out.println("Converted value of \"" + input + "\": " + result);
            } catch (NumberFormatException e) {
                System.out.println("Exception occurred for input \"" + input + "\": " + e.getMessage());
            }
        }
    }
}