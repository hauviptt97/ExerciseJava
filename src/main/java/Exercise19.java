import javax.swing.text.ParagraphView;
import java.math.BigInteger;

public class Exercise19 {

    private BigInteger calculateFactorial(BigInteger number) {
        return (number.equals(BigInteger.ZERO)) ? BigInteger.ONE : (number.multiply(calculateFactorial(number.subtract(BigInteger.ONE))));
    }

    private int C(int k, int n) {
        return (calculateFactorial(new BigInteger(n + "")).divide(calculateFactorial(new BigInteger(k + "")).multiply(calculateFactorial(new BigInteger(n - k + ""))))).intValue();
    }

    public String a(int number) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= number - i; j++) {
                result.append("  ");
            }
            for (int j = 0; j <= i; j++) {
                result.append("   " + C(j, i));
            }
            result.append("\n");
        }
        String[] lineData = result.toString().split("\n");
        return lineData[lineData.length-1].trim();
    }
}
