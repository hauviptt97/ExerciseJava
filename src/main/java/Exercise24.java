import java.util.ArrayList;
import java.util.List;

public class Exercise24 {
    public int countFibonacciNumbers(int n) {
        int a1 = 0, a2 = 1, a3 = 1;
        int count = 0;
        while (a2 <= n) {
            a1 = a2;
            a2 = a3;
            a3 = a1 + a2;
            count++;
        }
        return count;
    }
}

