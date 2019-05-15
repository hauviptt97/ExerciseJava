public class Exercise07 {
    public static int calculateTheSumOfExpression(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += (i * (i + 1));
        }
        return sum;
    }
}