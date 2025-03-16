import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for the Main class.
 */
public class ExerciseTests {
    /**
     * Test the safeDivision method.
     */
    @Test
    public void testSafeDivision() {
        assertEquals(2.0, Main.safeDivision(4.0, 2.0));
        assertEquals(0.0, Main.safeDivision(0.0, 2.0));
        assertEquals(0.0, Main.safeDivision(0.0, 0.0));
    }

    /**
     * Test the getSecondLetter method.
     */
    @Test
    public void testGetSecondLetter() {
        var logMessages = new java.util.ArrayList<String>();
        var result = Main.getSecondLetter("Hello", logMessages);

        assertEquals("e", result);
        assertEquals(1, logMessages.size());

        logMessages = new java.util.ArrayList<String>();
        result = Main.getSecondLetter("H", logMessages);

        assertEquals("", result);
        assertEquals(1, logMessages.size());
    }

    /**
     * Test the readFile method.
     */
    @Test
    public void testReadFile() {
        var logMessages = new java.util.ArrayList<String>();
        var result = Main.readFile(logMessages);

        assertEquals("Hello world", result);
        assertEquals(1, logMessages.size());
    }

    /**
     * Test the safeDivideWithCustomException method.
     */
    @Test
    public void testSafeDivideWithCustomException() {
        try {
            var result = Main.safeDivideWithCustomException(4.0, 0.0);
            Assertions.fail("safeDivideWithCustomException should throw a CustomDivideByZeroException: " + result);
        } catch (org.example.CustomDivideByZeroException e) {
            assertEquals(4.0, e.getA());
            assertEquals(0.0, e.getB());
        }
    }
}
