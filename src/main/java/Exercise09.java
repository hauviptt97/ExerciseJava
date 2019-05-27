public class Exercise09 {

    public double calculatePi() {
        int k = 0;
        double estimatePI = 0.0;
        double realPI = Math.PI;
        while (true) {
            double epsilon = realPI - estimatePI;
            if (epsilon <= 0.0001 && epsilon >= 0) {
                break;
            }
            estimatePI += 4 * (Math.pow(-1, k) / (2 * k + 1));
            k++;
        }
        return estimatePI;
    }
}
