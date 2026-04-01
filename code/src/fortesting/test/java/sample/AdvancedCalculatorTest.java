

package sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedCalculatorTest {

    @Test
    void multiply_shouldReturnProduct() {
        AdvancedCalculator calc = new AdvancedCalculator();
        assertEquals(6, calc.multiply(2, 3));
        assertEquals(0, calc.multiply(0, 5));
        assertEquals(-10, calc.multiply(-2, 5));
    }

    @Test
    void isEven_shouldReturnTrueForEven() {
        AdvancedCalculator calc = new AdvancedCalculator();
        assertTrue(calc.isEven(4));
        assertTrue(calc.isEven(0));
    }

    @Test
    void isEven_shouldReturnFalseForOdd() {
        AdvancedCalculator calc = new AdvancedCalculator();
        assertFalse(calc.isEven(3));
        assertFalse(calc.isEven(-1));
    }
}
