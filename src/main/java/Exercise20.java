import java.util.ArrayList;
import java.util.List;

public class Exercise20 {
    public int sumOfFibonacci(int n) {
        int a1, a2 = 1, a3 = 1;
        int sum = 2;
        while (a2 <= n) {
            a1 = a2;
            a2 = a3;
            a3 = a1 + a2;
            sum += a1 + a2;
        }
        return sum;
    }
}
