import java.util.Arrays;

public class Exercise16 {

    private double getDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    private boolean isTriangle(double a, double b, double c) {
        return (a + b > c);
    }

    private String findTypeOfTriangle(double a, double b, double c) {
        if (a == b && a == c) {
            return "tam giac deu";
        }

        if ((a - b) * (a - c) * (b - c) != 0) {
            if (c == Math.sqrt(a * a + b * b)) {
                return "tam giac vuong";
            }
            return "tam giac binh thuong";
        }

        return "tam giac can";
    }

    private double getArea(double a, double b, double c) {
        double p = getPerimeter(a, b, c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private double getPerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public String getDescribleTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = getDistance(x1, y1, x2, y2);
        double b = getDistance(x1, y1, x3, y3);
        double c = getDistance(x2, y2, x3, y3);
        double[] edges = new double[]{a, b, c};
        Arrays.sort(edges);
        if (isTriangle(edges[0], edges[1], edges[2])) {
            return "Kieu tam giac : " + findTypeOfTriangle(edges[0], edges[1], edges[2]) + "\nDien tich tam giac : " + getArea(a, b, c) + "\nChu vi tam giac : " + getPerimeter(a, b, c);
        } else {
            return "khong phai la tam giac";
        }
    }
}
