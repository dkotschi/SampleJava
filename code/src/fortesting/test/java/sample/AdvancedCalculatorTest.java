package sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {

    private final AdvancedCalculator calculator = new AdvancedCalculator();

    @Test
    void multiply_shouldReturnProduct() {
        assertEquals(12, calculator.multiply(3, 4));
        assertEquals(-6, calculator.multiply(2, -3));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(25, calculator.multiply(-5, -5));
    }

    @Test
    void isEven_shouldReturnTrueForEvenNumbers() {
        assertTrue(calculator.isEven(4));
        assertTrue(calculator.isEven(0));
        assertTrue(calculator.isEven(-2));
    }

    @Test
    void isEven_shouldReturnFalseForOddNumbers() {
        assertFalse(calculator.isEven(3));
        assertFalse(calculator.isEven(-1));
        assertFalse(calculator.isEven(7));
    }
}
