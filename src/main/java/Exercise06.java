public class Exercise06 {
    public String SolveTheQuadraticEquation(double number1, double number2, double number3) {
        if (number1 == 0) {
            if (number2 == 0) {
                return "pt vo nghiem";
            } else {
                return "x = " + (-number3 / number2);
            }
        } else {
            double delta = Math.pow(number2, 2) - 4 * number1 * number3;
            if (delta > 0) {
                double x1 = (-number2 + Math.sqrt(delta)) / (2 * number1);
                double x2 = (-number2 - Math.sqrt(delta)) / (2 * number1);
                return "x1 = " + x1 + " and x2 = " + x2;
            } else if (delta == 0) {
                return "x1 = x2 = " + (-number2 / (2 * number1));
            } else {
                return "pt vo nghiem";
            }
        }

    }
}
