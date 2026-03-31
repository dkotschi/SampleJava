package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {

    private final AdvancedCalculator calculator = new AdvancedCalculator();

    @Test
    void multiply_shouldReturnProductOfTwoNumbers() {
        assertEquals(15, calculator.multiply(3, 5));
        assertEquals(-12, calculator.multiply(3, -4));
        assertEquals(0, calculator.multiply(0, 100));
        assertEquals(1, calculator.multiply(1, 1));
    }

    @Test
    void isEven_shouldReturnTrueForEvenNumbers() {
        assertTrue(calculator.isEven(0));
        assertTrue(calculator.isEven(2));
        assertTrue(calculator.isEven(-4));
        assertTrue(calculator.isEven(100));
    }

    @Test
    void isEven_shouldReturnFalseForOddNumbers() {
        assertFalse(calculator.isEven(1));
        assertFalse(calculator.isEven(-3));
        assertFalse(calculator.isEven(7));
        assertFalse(calculator.isEven(99));
    }
}
