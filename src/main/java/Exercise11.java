public class Exercise11 {
    public double calculateMoney(int n) {
        return n > 0 ? 100 * Math.pow((1 + 1.0 / n), n) : 200;
    }
}
