import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void checkAdd() {
        assertEquals(4, calculator.add(2, 2));
    }
    @Test
    public void checkSubtract() {
        assertEquals(5, calculator.subtract(7, 2));
    }
    @Test
    public void checkMultiply() {
        assertEquals(6, calculator.multiply(3, 2));
    }
    @Test
    public void checkDivide() {
        assertEquals(2.5, calculator.divide(5, 2), 0.01);
    }
}
