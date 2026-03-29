package sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    private final AdvancedCalculator calculator = new AdvancedCalculator();

    @Test
    void multiply_shouldReturnProduct() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(5, 0));
        assertEquals(-10, calculator.multiply(-2, 5));
        assertEquals(15, calculator.multiply(-3, -5));
    }

    @Test
    void isEven_shouldReturnTrueForEvenNumbers() {
        assertTrue(calculator.isEven(2));
        assertTrue(calculator.isEven(0));
        assertTrue(calculator.isEven(-4));
    }

    @Test
    void isEven_shouldReturnFalseForOddNumbers() {
        assertFalse(calculator.isEven(3));
        assertFalse(calculator.isEven(-1));
        assertFalse(calculator.isEven(7));
    }
}
