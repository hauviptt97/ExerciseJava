import java.util.ArrayList;
import java.util.List;

public class Exercise17 {

    private int sumOfDigits(int number) {
        int count = 0;
        while (number >= 10) {
            number /= 10; // hay n = n /10;
            count++;
        }
        return count + 1;
    }

    private boolean isValidNumber(int number) {
        int sum = 0, a = number;
        int index = sumOfDigits(number);
        do {
            int temp = number % 10;
            sum += Math.pow(temp, index);
            number /= 10;
        } while (number > 0);
        if (sum == a) {
            return true;
        } else {
            return false;
        }
    }

    public List<Integer> displayResult() {
        List<Integer> result = new ArrayList();
        for (int number = 10; number < 100000; number++) {
            if (isValidNumber(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
