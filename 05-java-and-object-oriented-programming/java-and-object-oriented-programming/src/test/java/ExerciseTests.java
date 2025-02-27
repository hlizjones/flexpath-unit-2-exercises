import org.example.Exercises;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ExerciseTests {
    @Test
    public void testAddTwoPlusTwo() {
        Exercises exercises = new Exercises();
        int result = exercises.addTwoPlusTwo();
        assertEquals(4, result);
    }

    @Test
    public void testMultiplyPiBy5() {
        Exercises exercises = new Exercises();
        double result = exercises.multiplyPiBy5();
        assertEquals(15.7, result, 0.1);
    }

    @Test
    public void testConcatenateNameAndAge() {
        Exercises exercises = new Exercises();
        String result = exercises.concatenateNameAndAge();
        assertEquals("Alice25", result);
    }

    @Test
    public void testContinueOrEnd() {
        Exercises exercises = new Exercises();
        String result = exercises.continueOrEnd();
        assertEquals("The program will continue", result);
    }

    @Test
    public void testStoreIndexInArray() {
        Exercises exercises = new Exercises();
        int[] result = exercises.storeIndexInArray();
        assertArrayEquals(new int[]{0, 1, 2}, result);
    }

    @Test
    public void testCountCorrect() {
        Exercises exercises = new Exercises();
        int result = exercises.countCorrect();
        assertEquals(1, result);
    }

    @Test
    public void testMultiply() {
        Exercises exercises = new Exercises();
        int result = exercises.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void testSumArray() {
        Exercises exercises = new Exercises();
        int result = exercises.sumArray(new int[]{1, 2, 3, 4, 5});
        assertEquals(15, result);
    }
}
