import java.util.Arrays;

public class Exercise15 {
    private boolean isTriangle(double a, double b, double c) {
        return a + b > c;
    }

    private String findTypeOfTriangle(double a, double b, double c) {
        if (a == b && a == c) {
            return "tam giac deu";
        }
        if (a != b && a != c && b != c) {
            if (Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2))) {
                return "tam giac vuong";
            }
            return "tam giac binh thuong";
        }
        return "tam giac can";
    }

    public double getArea(double a, double b, double c) {
        double HalfPerimeter = getPerimeter(a, b, c) / 2;
        return Math.sqrt(HalfPerimeter * (HalfPerimeter - a) * (HalfPerimeter - b) * (HalfPerimeter - c));
    }

    public double getPerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public String getTriangle(double a, double b, double c) {
        double[] edges = new double[]{a, b, c};
        Arrays.sort(edges);
        if (isTriangle(edges[0], edges[1], edges[2])) {
            return "Kieu tam giac : " + findTypeOfTriangle(edges[0], edges[1], edges[2]) + "\nDien tich tam giac : " + getArea(a, b, c) + "\nChu vi tam giac : " + getPerimeter(a, b, c);
        } else {
            return "khong phai la tam giac";
        }
    }
}
