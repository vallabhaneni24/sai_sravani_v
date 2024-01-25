package strings_test;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.*;
import strings.CheckAnagram;

public class CheckAnagramTest {

    @Test
    public void testAreAnagramsWhenAnagrams() {
        assertTrue(CheckAnagram.areAnagrams("listen", "silent"));
    }

    @Test
    public void testAreAnagramsWhenNotAnagrams() {
        assertFalse(CheckAnagram.areAnagrams("hello", "world"));
    }

    @Test
    public void testAreAnagramsWhenDifferentLengths() {
        assertFalse(CheckAnagram.areAnagrams("abc", "abcd"));
    }

    @Test
    public void testAreAnagramsWhenEmptyStrings() {
        assertTrue(CheckAnagram.areAnagrams("", ""));
    }

    @Test
    public void testAreAnagramsWhenSpacesIgnored() {
        assertTrue(CheckAnagram.areAnagrams("Astronomer", "Moon starer"));
    }
}