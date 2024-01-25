package strings_test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import strings.ReverseWordsInSentence;

public class ReverseWordsInSentenceTest {

    @Test
    public void testReverseWords() {
        String inputSentence = "Hello World";
        String expectedReversedSentence = "olleH dlroW";

        String actualReversedSentence = ReverseWordsInSentence.reverseWords(inputSentence);

        assertEquals(expectedReversedSentence, actualReversedSentence);
    }


}