public class Exercise09 {

    public double calculatePi() {
        int k = 1;
        double currentValue = 4;
        double previousValue = 0;
        double epsilon = 0.0001;
        while (Math.abs(currentValue - previousValue) > epsilon) {
            previousValue = currentValue;
            currentValue += 4f * (1 - (k & 1) * 2) / (2 * k + 1);
            k++;
        }
        return currentValue;
    }
}
