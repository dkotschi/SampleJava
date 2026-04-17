package sample;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AdvancedCalculatorTest {

    @Test
    void testMultiplyWithPositiveNumbers() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        int a = 7;
        int b = 6;
        int expected = a * b;
        assertEquals(expected, calculator.multiply(a, b));
    }

    @Test
    void testMultiplyWithNegativeAndPositiveNumber() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        int a = -4;
        int b = 5;
        int expected = a * b;
        assertEquals(expected, calculator.multiply(a, b));
    }

    @Test
    void testMultiplyWithZero() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        int a = 0;
        int b = 12345;
        int expected = a * b;
        assertEquals(expected, calculator.multiply(a, b));
    }

    @Test
    void testMultiplyWithBothNegativeNumbers() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        int a = -3;
        int b = -9;
        int expected = a * b;
        assertEquals(expected, calculator.multiply(a, b));
    }

    @Test
    void testIsEvenWithEvenPositiveNumber() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        int number = 24;
        assertTrue(calculator.isEven(number));
    }

    @Test
    void testIsEvenWithOddPositiveNumber() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        int number = 25;
        assertFalse(calculator.isEven(number));
    }

    @Test
    void testIsEvenWithZero() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        int number = 0;
        assertTrue(calculator.isEven(number));
    }

    @Test
    void testIsEvenWithNegativeEvenNumber() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        int number = -8;
        assertTrue(calculator.isEven(number));
    }

    @Test
    void testIsEvenWithNegativeOddNumber() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        int number = -7;
        assertFalse(calculator.isEven(number));
    }
}
