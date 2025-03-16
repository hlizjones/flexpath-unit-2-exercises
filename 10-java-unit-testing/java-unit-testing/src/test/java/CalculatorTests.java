import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1));
        assertEquals(0, calculator.add(-1, 1)); // Edge case: adding negative numbers
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(2,1));
        assertEquals(2, calculator.subtract(1,-1)); // Edge case: subtracting a negative numbers
        assertEquals(-1, calculator.subtract(1,2)); // Edge case: negative result
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(3,calculator.multiply(1, 3));
        assertEquals(-3, calculator.multiply(-1, 3)); // Edge case: multiplying negative numbers
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6,3));
        assertEquals(-2, calculator.divide(-6,3)); // Edge case: dividing a negative numbers
        assertThrows(ArithmeticException.class, () -> calculator.divide(6,0));
    }
}
