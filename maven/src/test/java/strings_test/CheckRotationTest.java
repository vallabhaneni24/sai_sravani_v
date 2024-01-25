package strings_test;

import org.junit.Test;
import static org.junit.Assert.*;
import strings.CheckRotation;

public class CheckRotationTest {

    @Test
    public void testAreRotationsWhenRotations() {
        assertTrue(CheckRotation.areRotations("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"));
    }

    @Test
    public void testAreRotationsWhenNotRotations() {
        assertFalse(CheckRotation.areRotations("Hello", "World"));
    }

    @Test
    public void testAreRotationsWhenEmptyStrings() {
        assertFalse(CheckRotation.areRotations("", ""));
    }

    @Test
    public void testAreRotationsWhenDifferentLengths() {
        assertFalse(CheckRotation.areRotations("abc", "abcd"));
    }
}