public class Exercise24 {
    public int countFibonacciNumbers(int n) {
        if (n >= 2) {
            int a1 = 1, a2 = 1;
            int count = 1;
            while (a2 <= n) {
                int temp = a1;
                a1 = a2;
                a2 = temp + a1;
                count++;
            }
            return count;
        }
        if (n > 0) {
            return n + 1;
        }
        return 0;
    }
}

