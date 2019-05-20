import java.util.ArrayList;
import java.util.List;

public class Exercise18 {
    private List convertDecimalToBinary(int number) {
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add((number % 2 == 0) ? 0 : 1);
            number /= 2;
        }
        return digits;
    }

    private int convertBinaryToDecimal(List<Integer> binaryDigits) {
        int power = binaryDigits.size() - 1;
        int result = 0;
        for (int index = 0; index < binaryDigits.size(); index++) {
            result += binaryDigits.get(index) * Math.pow(2, power);
            power--;
        }

        return result;
    }

    public int convertNumber(int number) {
        List<Integer> binaryDigits = convertDecimalToBinary(number);
        return convertBinaryToDecimal(binaryDigits);
    }
}
