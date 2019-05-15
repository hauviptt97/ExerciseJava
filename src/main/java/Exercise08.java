import java.math.BigInteger;
public class Exercise08 {
    public BigInteger calculateFactorial(BigInteger number) {
        return (number.equals(BigInteger.ZERO)) ? BigInteger.ONE : (number.multiply(calculateFactorial(number.subtract(BigInteger.ONE))));
    }
}