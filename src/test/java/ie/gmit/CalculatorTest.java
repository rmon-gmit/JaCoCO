package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    void addTestTrue() {
        assertEquals(60, calculator.add(50, 10), 0);
    }

    @Test
    void addTestFalse() {
        assertThrows(IllegalArgumentException.class, () -> calculator.add(0, 3));
    }

    @Test
    void subtractTestTrue() {
        assertEquals(40, calculator.subtract(50, 10), 0);
    }

    @Test
    void subtractTestFalse() {
        assertThrows(IllegalArgumentException.class, () -> calculator.subtract(50, 60));
    }

    @Test
    void multiplyTestTrue() {
        assertEquals(500, calculator.multiply(50, 10), 0);
    }

    @Test
    void multiplyTestFalse() {
        assertThrows(IllegalArgumentException.class, () -> calculator.multiply(0, 0));
    }

    @Test
    void divideTestTrue() {
        assertEquals(5, calculator.divide(50, 10), 0);
    }

    @Test
    void divideTestFalse() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(50, 0));
    }
}
