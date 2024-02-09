package test_lambdas;

import lambdas.VowelCount;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class VowelCountTest {

    @Test
    public void testVowelCount() {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Execute the main method
        VowelCount.main(new String[]{});

        // Normalize line separators in expected and actual output
        String expectedOutput = "apple - Number of vowels: 2" + System.lineSeparator() +
                "banana - Number of vowels: 3" + System.lineSeparator() +
                "orange - Number of vowels: 3" + System.lineSeparator() +
                "grape - Number of vowels: 2" + System.lineSeparator() +
                "kiwi - Number of vowels: 2" + System.lineSeparator();

        String actualOutput = outContent.toString();

        // Compare the expected and actual output
        assertEquals(expectedOutput, actualOutput);
    }
}
