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
    void subtractTestTrue() {
        assertEquals(40, calculator.subtract(50, 10), 0);
    }

    @Test
    void multiplyTestTrue() {
        assertEquals(500, calculator.multiply(50, 10), 0);
    }

    @Test
    void divideTestTrue() {
        assertEquals(5, calculator.divide(50, 10), 0);
    }

    @Test
    void divideTestFalse() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> calculator.divide(50, 0));
        assertEquals("Cannot divide by 0", e.getMessage());
    }
}
