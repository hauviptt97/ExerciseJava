public class Exercise14 {

    public double sqrt(int a) {
        if (a > 0) {
            double f = a;
            double previousValue = 0;
            while (Math.abs(f - previousValue) > 0.0001) {
                previousValue = f;
                f = a / (2 * f) + f / 2;
            }
            return f;
        }
        return 0;
    }
}