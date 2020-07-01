import java.math.BigInteger;

public class BSTcount {
    public long howMany(int[] values) {

        BigInteger a = factorial(2*values.length);

        BigInteger b = factorial(values.length + 1).multiply(factorial(values.length));

        BigInteger c = a.divide(b);

        return c.longValue();
    }
    public BigInteger factorial(long n){


        if(n == 0) return BigInteger.ONE;

        return new BigInteger(String.valueOf(n)).multiply(factorial(n-1));
    }
}