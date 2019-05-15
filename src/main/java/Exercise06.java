public class Exercise06 {
    public String SolveTheQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                return "pt vo nghiem";
            } else {
                return "x = " + (-c / b);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "x1 = " + x1 + " and x2 = " + x2;
            } else if (Math.abs(delta)< 0.000001) {
                return "x1 = x2 = " + (-b / (2 * a));
            } else {
                return "pt vo nghiem";
            }
        }

    }
}
