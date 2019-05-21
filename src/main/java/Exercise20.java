public class Exercise20 {
    public int sumOfFibonacci(int n) {
        if (n >= 2) {
            int a1 = 1, a2 = 1;
            int sum = 2;
            for (int count = 2; count < n; count++) {
                int temp = a1;
                a1 = a2;
                a2 = temp + a1;
                sum += a2;
            }
            return sum;
        }
        if (n > 0) {
            return 1;
        }
        return 0;


    }
}
