package sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {

    @Test
    void multiply_shouldReturnProduct() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        assertEquals(12, calculator.multiply(3, 4));
        assertEquals(-6, calculator.multiply(2, -3));
        assertEquals(0, calculator.multiply(5, 0));
        assertEquals(25, calculator.multiply(-5, -5));
    }

    @Test
    void isEven_shouldReturnTrueForEvenNumbers() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        assertTrue(calculator.isEven(4));
        assertTrue(calculator.isEven(0));
        assertTrue(calculator.isEven(-2));
        assertTrue(calculator.isEven(100));
    }

    @Test
    void isEven_shouldReturnFalseForOddNumbers() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        assertFalse(calculator.isEven(3));
        assertFalse(calculator.isEven(-1));
        assertFalse(calculator.isEven(99));
        assertFalse(calculator.isEven(1));
    }
}
