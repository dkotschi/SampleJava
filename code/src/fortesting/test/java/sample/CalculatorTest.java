package sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_shouldReturnSum() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(2, -3));
        assertEquals(0, calc.add(-2, 2));
    }

    @Test
    void subtract_shouldReturnDifference() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(3, 2));
        assertEquals(5, calc.subtract(3, -2));
        assertEquals(-5, calc.subtract(-3, 2));
    }

    @Test
    void divide_shouldReturnQuotient() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(6, 3));
        assertEquals(-2, calc.divide(6, -3));
        assertEquals(-2, calc.divide(-6, 3));
        assertEquals(2, calc.divide(-6, -3));
    }

    @Test
    void divide_shouldThrowExceptionWhenDividingByZero() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
        assertThrows(IllegalArgumentException.class, () -> calc.divide(-5, 0));
        assertThrows(IllegalArgumentException.class, () -> calc.divide(0, 0));
    }
}
