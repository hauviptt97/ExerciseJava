public class Exercise13 {

    private double calculateFactorial(int number) {
        return number == 0 ? 1 : number * calculateFactorial(number - 1);
    }

    public double calculateE() {
        int k = 0;
        double estimateE = 0.0;
        double realE = Math.E;
        while (true) {
            double epsilon = realE - estimateE;
            if (epsilon <= 0.00001 && epsilon >= 0) {
                break;
            }
            estimateE += 1 / calculateFactorial(k);
            k++;
        }
        return estimateE;
    }
}
