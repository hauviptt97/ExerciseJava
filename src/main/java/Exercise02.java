public class Exercise02 {
    public int calTotal(int qty) {
        int result = 0;
        while (qty > 0) {
            result += (qty % 10);
            qty /= 10;
        }
        return result;
    }
}
