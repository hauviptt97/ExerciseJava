import java.util.ArrayList;
import java.util.List;

public class Exercise20 {
    private List<Integer> calculateFibonacci(int number) {
        List<Integer> elementsOfFibonacci = new ArrayList<>();
        elementsOfFibonacci.add(1);
        elementsOfFibonacci.add(1);

        int count = 0;
        int[] arrNum = new int[]{1, 1};

        while (count < number) {
            int sum = arrNum[0] + arrNum[1];
            elementsOfFibonacci.add(sum);
            arrNum[0] = arrNum[1];
            arrNum[1] = sum;
            count++;
        }
        return elementsOfFibonacci;
    }

    public int sumOfFibonacci(int number) {
        return calculateFibonacci(number).stream().limit(number).mapToInt(Integer::intValue).sum();
    }
}
