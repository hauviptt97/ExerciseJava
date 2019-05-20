import java.math.BigInteger;

public class Exercise27 {
    private BigInteger calculateFactorial(BigInteger number) {
        return (number.equals(BigInteger.ZERO)) ? BigInteger.ONE : (number.multiply(calculateFactorial(number.subtract(BigInteger.ONE))));
    }

    public int countZeroInNumber(int number) {
        int count = 0;
        BigInteger factorial = calculateFactorial(new BigInteger(number + ""));
        while (factorial.compareTo(BigInteger.ZERO) > 0) {
            if (factorial.divideAndRemainder(BigInteger.TEN)[1].compareTo(BigInteger.ZERO) == 0) {
                count++;
            }
            factorial = factorial.divide(BigInteger.TEN);
        }
        return count;

    }
}
