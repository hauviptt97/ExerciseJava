public class Exercise01 {
    public int findGCD(int qty1, int qty2) {
        if (qty1 == 0 || qty2 == 0) {
            return qty1 + qty2;
        }

        while (qty1 != qty2) {
            if (qty1 > qty2)
                qty1 -= qty2;
            else
                qty2 -= qty1;
        }
        return qty1;
    }

    public int findLCM(int qty1, int qty2) {
        return (qty1 * qty2) / findGCD(qty1, qty2);
    }

}
