public class Exercise26 {
    public int getCrazyFibonacci(int[] a, int n) {
        if (n <= 5 && n > 0) return a[n - 1];

        if (n < 1) return 0;

        int a5 = 0;
        for (int i = 6; i <= n; i++) {
            a5 = (a[0] + a[1] + a[2] + a[3] + a[4]) % 10;
            a[0] = a[1];
            a[1] = a[2];
            a[2] = a[3];
            a[3] = a[4];
            a[4] = a5;
        }
        return a5;
    }
}
