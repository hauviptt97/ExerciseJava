import java.util.Arrays;

public class Exercise19 {

    private long calculateFactorial(int number) {
        return (number == 0) ? 1 : (number * calculateFactorial(number - 1));
    }

    private long C(int k, int n) {
        long x1= calculateFactorial(n);
        long x2 = calculateFactorial(k);
        long x3 = calculateFactorial(n - k);
teFactorial(n) / (calculateFactorial(k) * (calculateFactorial(n - k))));
    }

    public long[] getLastLineInPascalTriangle(int number) {
        long[] result = new long[number];
        result[0] = 1;
        for (int n = 0; n < number; n++) {
            for (int k = 1; k <= n; k++)
                result[k] = C(k, n);
        }
        return result;
    }

}