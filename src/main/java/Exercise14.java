public class Exercise14 {

    private double calculateFactorial(int number) {
        return number == 0 ? 1 : number * calculateFactorial(number - 1);
    }

    public double sqrt(int a) {
        int f = a;
        double estimateSqrt = 3;
        double realSqrt = Math.PI;
        while (true) {
            double epsilon = realSqrt - estimateSqrt;
            if (epsilon <= 0.0001 && epsilon >= 0) {
                break;
            }
            estimateSqrt += 4 * (Math.pow(-1, k) / ((calculateFactorial(2 * k) / calculateFactorial(l))));
            k++;
            l += 2;
        }
        return estimatePI;
    }
}