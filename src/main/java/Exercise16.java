import java.util.Arrays;

public class Exercise16 {

    private double getEdgeByCoordinates(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    private boolean isTriangle(double a, double b, double c) {
        return a + b > c;
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
        double HalfPerimeter = getPerimeter(a, b, c) / 2;
        return Math.sqrt(HalfPerimeter * (HalfPerimeter - a) * (HalfPerimeter - b) * (HalfPerimeter - c));
    }

    private double getPerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public String getTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = getEdgeByCoordinates(x1, y1, x2, y2);
        double b = getEdgeByCoordinates(x1, y1, x3, y3);
        double c = getEdgeByCoordinates(x2, y2, x3, y3);
        double[] edges = new double[]{a, b, c};
        Arrays.sort(edges);
        System.out.println(Arrays.toString(edges));
        System.out.println(edges[2] * edges[2] == (edges[1] * edges[1] + edges[0] * edges[0]));
        if (isTriangle(edges[0], edges[1], edges[2])) {
            return "Kieu tam giac : " + findTypeOfTriangle(edges[0], edges[1], edges[2]) + "\nDien tich tam giac : " + getArea(a, b, c) + "\nChu vi tam giac : " + getPerimeter(a, b, c);
        } else {
            return "khong phai la tam giac";
        }
    }
}
