package additional_test;

public class CaseConverterTest {
    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {"Hello World", "HELLO WORLD", "hello world", "123", "", "Hello123World"};

        // Test the convertCase method
        for (String str : testStrings) {
            String convertedString = CaseConverter.convertCase(str);
            System.out.println("Original string: " + str);
            System.out.println("Converted string: " + convertedString);
            System.out.println();
        }
    }
}