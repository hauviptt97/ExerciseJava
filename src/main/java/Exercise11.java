public class Exercise11 {
    public double calculateMoney(int n) {
        return 100 * Math.pow((1 + 1 / n),  n);
    }

    public static void main(String[] args) {
        System.out.println(new Exercise11().calculateMoney(2));
    }
}
