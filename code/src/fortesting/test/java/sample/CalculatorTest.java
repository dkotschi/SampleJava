package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_shouldReturnSum() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void subtract_shouldReturnDifference() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    void divide_shouldThrowExceptionOnZero() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
    }

    @Test
    void divide_shouldReturnQuotient() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.divide(10, 2));
        assertEquals(-3, calc.divide(9, -3));
        assertEquals(0, calc.divide(0, 5));
    }
}
