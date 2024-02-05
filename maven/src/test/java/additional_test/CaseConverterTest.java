package additional;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CaseConverterTest {

    @Test
    public void testConvertCase() {
        // Test cases
        String[] testStrings = {"Hello World", "HELLO WORLD", "hello world", "123", "", "Hello123World"};
        String[] expectedResults = {"hELLO wORLD", "hello world", "HELLO WORLD", "123", "", "hELLO123wORLD"};

        // Test the convertCase method
        for (int i = 0; i < testStrings.length; i++) {
            String convertedString = CaseConverter.convertCase(testStrings[i]);
            assertEquals("Conversion failed for: " + testStrings[i], expectedResults[i], convertedString);
        }
    }
}