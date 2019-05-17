public class Exercise19 {

    private int calculateFactorial(int number) {
        return (number == 0) ? 1 : (number * calculateFactorial(number - 1));
    }

    private int C(int k, int n) {
        return (calculateFactorial(n) / (calculateFactorial(k) * (calculateFactorial(n - k))));
    }

    public int[] a(int number) {
        int count = 0;
        int[] result = new int[number];
        for (int i = 0; i < number; i++) {
            for (int j = number - 1; j >= 0; j--) {
                result[count++] = C(j, i);
            }
        }
        return result;
    }
}
