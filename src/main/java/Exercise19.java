import java.math.BigInteger;
import java.util.Arrays;

public class Exercise19 {

    private BigInteger calculateFactorial(BigInteger number) {
        return (number.equals(BigInteger.ZERO)) ? BigInteger.ONE : (number.multiply(calculateFactorial(number.subtract(BigInteger.ONE))));
    }

    private BigInteger C(int k, int n) {
        return calculateFactorial(new BigInteger(n + "")).divide((calculateFactorial(new BigInteger(k + "")).multiply(calculateFactorial(new BigInteger((n - k) + "")))));
    }

    public String getLastLineInPascalTriangle(int number) {
        BigInteger[] result = new BigInteger[number];
        result[0] = BigInteger.ONE;
        for (int n = 0; n < number; n++) {
            for (int k = 1; k <= n; k++) {
                result[k] = C(k, n);
            }
        }
        return Arrays.toString(result);
    }
}