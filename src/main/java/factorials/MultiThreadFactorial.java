package factorials;


import java.math.BigInteger;
import java.util.stream.Stream;


public class MultiThreadFactorial implements Factorial {

    public BigInteger calculate(int n) {
        if (isValid(n)) {
            BigInteger result = BigInteger.ONE;
            return (n == 0) ? result : Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE)).limit(n).parallel().
                    reduce((previous, current) -> previous.multiply(current)).get();
        } else
            throw new IllegalArgumentException("Wrong input. The factorial`s value can`t be negative.");
    }

    private boolean isValid(int n) {
        return (n >= 0);
    }

}
