
public class Exercise10 {

    private static long calculateFactorial(int number) {
        return number == 0 ? 1 : number * calculateFactorial(number - 1);
    }

    public static double calculatePi() {
        int k = 2;
        int l = 1;
        double estimatePI = 3;
        double realPI = Math.PI;
        while (true) {
            double epsilon = realPI - estimatePI;
            if (epsilon <= 0.00001 && epsilon >= 0) {
                break;
            }
            estimatePI += 4 * (Math.pow(-1, k) / ((calculateFactorial(2 * k) / calculateFactorial(l))));
            System.out.println(k);
            System.out.println(l);
            System.out.println(estimatePI);
            k++;
            l += 2;
        }
        return estimatePI;
    }

    public static void main(String[] args) {
        System.out.println(calculatePi());
    }
}
