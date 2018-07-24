import static junit.framework.Assert.*;

import factorials.Factorial;
import factorials.MultiThreadFactorial;

import org.junit.Test;

import java.math.BigInteger;

public class FactorialTest {

    @Test
    public void testFactorialCalculate() {
        Factorial factorial = new MultiThreadFactorial();
        BigInteger result = factorial.calculate(5);

        assertEquals(BigInteger.valueOf(120), result);

        result = factorial.calculate(0);
        assertEquals(BigInteger.valueOf(1), result);
    }


    @Test(expected = IllegalArgumentException.class)
    public void whenExceptionThrown_thenExpectationSatisfied() {
        Factorial factorial = new MultiThreadFactorial();
        BigInteger result = factorial.calculate(-5);

    }

}
