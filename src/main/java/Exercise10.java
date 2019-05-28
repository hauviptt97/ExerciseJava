
public class Exercise10 {

    public double calculatePi() {
        int k = 1;
        double currentValue = 3;
        double previousValue = 0;
        double epsilon = 0.00001;
        while (Math.abs(currentValue - previousValue) > epsilon) {
            previousValue = currentValue;
            currentValue += 2f / (((k & 1) * 2 - 1) * (k * (2 * k + 1) * (2 * k + 2)));
            k++;
        }
        return currentValue;
    }
}
