public class Exercise28 {
    public double sqrt(double number) {
        if (number >= 0) {
            double result = 0;
            double right = number;
            double left = 0;
            double measurementUncertainty = 0.000001;
            while (right - left > measurementUncertainty) {
                result = (right + left) / 2;
                if (result * result - number < 0) {
                    left = result;
                } else {
                    right = result;
                }
            }
            return result;
        }
        return 0;
    }
}
