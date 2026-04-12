package sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    private final AdvancedCalculator calculator = new AdvancedCalculator();

    @Test
    public void multiply_shouldReturnProduct() {
        assertEquals(12, calculator.multiply(3, 4));
        assertEquals(-6, calculator.multiply(2, -3));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(1, calculator.multiply(-1, -1));
    }

    @Test
    public void isEven_shouldReturnTrueForEvenNumbers() {
        assertTrue(calculator.isEven(2));
        assertTrue(calculator.isEven(0));
        assertTrue(calculator.isEven(-4));
        assertTrue(calculator.isEven(100));
    }

    @Test
    public void isEven_shouldReturnFalseForOddNumbers() {
        assertFalse(calculator.isEven(1));
        assertFalse(calculator.isEven(-3));
        assertFalse(calculator.isEven(99));
        assertFalse(calculator.isEven(-1));
    }
}
