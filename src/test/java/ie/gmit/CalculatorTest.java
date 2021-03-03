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

    void addTestFalse() {
        assertThrows(IllegalArgumentException.class, () -> calculator.add(0, 3));
    }

    @Test
    void subtractTest() {
        double result = calculator.subtract(50, 10);
        assertEquals(40, result, 0);
    }

    @Test
    void multiplyTest() {
        double result = calculator.multiply(50, 10);
        assertEquals(500, result, 0);
    }

    @Test
    void divideTest() {
        double result = calculator.divide(50, 10);
        assertEquals(5, result, 0);
    }
}
