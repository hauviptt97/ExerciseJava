public class Exercise01 {
    public int findGCD(int number1, int number2) {
        if ((number1 * number2) == 0) {
            return number1 + number2;
        }

        while (number1 != number2) {
            if (number1 > number2)
                number1 -= number2;
            else
                number2 -= number1;
        }
        return number1;
    }

    public int findLCM(int qty1, int qty2) {
        return (qty1 * qty2) / findGCD(qty1, qty2);
    }

}
