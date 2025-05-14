package sessions.unit_testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        System.out.println("Before each test");
        calculator = new Calculator();
    }

    @BeforeClass
    public static void setupClass() {
        System.out.println("Once before all tests");
    }

    @Test
    public void add_shouldAddTwoIntegers() {
        int expected = 3;
        int actual = calculator.add(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void checkIfEven_shouldReturnTrueIfNumberIsEven() {
        assertTrue(calculator.checkIfEven(14));
    }

    @Test
    public void checkIfEven_shouldReturnFalseIfNumberIsNotEven() {
        assertFalse(calculator.checkIfEven(5));
    }

    @Test
    public void addToList_shouldAddNumberToList() {
        assertNotNull(calculator.getList());
        assertEquals(0, calculator.getList().size());
        calculator.addToList(5);
        assertEquals(1, calculator.getList().size());
        assertTrue(calculator.getList().contains(5));
    }
}