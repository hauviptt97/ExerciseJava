import java.util.HashMap;
import java.util.Map;

public class Exercise29 {
    private int getRomanLetterValue(char letter) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('M', 1000);
        values.put('D', 500);
        values.put('C', 100);
        values.put('L', 50);
        values.put('X', 10);
        values.put('V', 5);
        values.put('I', 1);
        return values.get(letter);
    }

    public int getNumberByRomanLetter(String input) {
        int result = 0;
        int lastValue = 0;
        for (int i = 0; i < input.length(); i++) {
            int currentValue = getRomanLetterValue(input.charAt(i));
            if (currentValue > lastValue) {
                result += (currentValue - 2 * lastValue);
            } else {
                result += currentValue;
            }
            lastValue = currentValue;
        }
        return result;
    }
}
