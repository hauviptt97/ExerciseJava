import java.util.Arrays;

public class Exercise19 {

    private int calculateFactorial(int number) {
        return (number == 0) ? 1 : (number * calculateFactorial(number - 1));
    }

    private int C(int k, int n) {
        return (calculateFactorial(n) / (calculateFactorial(k) * (calculateFactorial(n - k))));
    }

    public int[] getLastLineInPascalTriangle(int number) {
        int[] result = new int[number];
        result[0] = 1;
        for (int n = 0; n < number; n++) {
            for (int k = 1; k <= n; k++)
                result[k] = C(k, n);
        }
        return result;
    }

}