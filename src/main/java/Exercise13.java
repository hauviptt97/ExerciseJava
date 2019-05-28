public class Exercise13 {

    public double calculateE() {
        int k = 1;
        double currentValue = 1;
        double previousValue = 0;
        double epsilon = 0.00001;
        while (Math.abs(currentValue - previousValue) > epsilon) {
            previousValue = currentValue;
            currentValue += previousValue / k;
            System.out.println(currentValue);
            k++;
        }
        return currentValue;
    }
}
