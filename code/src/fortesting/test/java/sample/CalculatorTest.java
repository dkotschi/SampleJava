package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_shouldReturnSum() {
        Calculator calc = new Calculator();
        int a = 2;
        int b = 3;
        int expected = a + b;
        assertEquals(expected, calc.add(a, b));
    }

    @Test
    void add_withNegativeNumbers() {
        Calculator calc = new Calculator();
        int a = -4;
        int b = -6;
        int expected = a + b;
        assertEquals(expected, calc.add(a, b));
    }

    @Test
    void add_withZero() {
        Calculator calc = new Calculator();
        int a = 0;
        int b = 7;
        int expected = a + b;
        assertEquals(expected, calc.add(a, b));
    }

    @Test
    void subtract_shouldReturnDifference() {
        Calculator calc = new Calculator();
        int a = 3;
        int b = 2;
        int expected = a - b;
        assertEquals(expected, calc.subtract(a, b));
    }

    @Test
    void subtract_resultNegative() {
        Calculator calc = new Calculator();
        int a = 2;
        int b = 5;
        int expected = a - b;
        assertEquals(expected, calc.subtract(a, b));
    }

    @Test
    void subtract_withZero() {
        Calculator calc = new Calculator();
        int a = 9;
        int b = 0;
        int expected = a - b;
        assertEquals(expected, calc.subtract(a, b));
    }

    @Test
    void divide_shouldReturnQuotient() {
        Calculator calc = new Calculator();
        int a = 10;
        int b = 2;
        int expected = a / b;
        assertEquals(expected, calc.divide(a, b));
    }

    @Test
    void divide_withNegativeNumbers() {
        Calculator calc = new Calculator();
        int a = -9;
        int b = 3;
        int expected = a / b;
        assertEquals(expected, calc.divide(a, b));
    }

    @Test
    void divide_truncatesTowardsZero() {
        Calculator calc = new Calculator();
        int a = 7;
        int b = 2;
        int expected = a / b;
        assertEquals(expected, calc.divide(a, b));
    }

    @Test
    void divide_byZeroThrowsException() {
        Calculator calc = new Calculator();
        int a = 5;
        int b = 0;
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> calc.divide(a, b));
        assertEquals("Division by zero", ex.getMessage());
    }
}
