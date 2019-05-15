import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercise12 {
    public BigInteger calculateFactorial(BigInteger number) {
        return (number.equals(BigInteger.ZERO)) ? BigInteger.ONE : (number.multiply(calculateFactorial(number.subtract(BigInteger.ONE))));
    }

    public String calculateTheSumOfExpression(int number) {
        if (number < 0) {
            return "Error";
        } else {
            double sum = 0;
            for (int i = 0; i <= number; i++) {
                sum += (BigInteger.ONE.doubleValue() / calculateFactorial(BigInteger.valueOf(i)).doubleValue());
            }
            return sum+"";
        }
    }

}
