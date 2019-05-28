public class Exercise13 {

    public double calculateE() {
        int k = 1;
        double currentValue = 1;
        double sum = currentValue;
        double epsilon = 0.00001;
        while (currentValue > epsilon) {
            currentValue = currentValue / k;
            sum += currentValue;
            k++;
        }
        return sum;
    }
}
