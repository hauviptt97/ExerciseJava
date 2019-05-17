import java.util.ArrayList;
import java.util.List;

public class Exercise20 {
    private List<Integer> calculateFibonacci(int number) {
        List<Integer> elementsOfFibonacci = new ArrayList<>();
        elementsOfFibonacci.add(1);
        elementsOfFibonacci.add(1);

        int[] arrNum = new int[]{1, 1};

        while (elementsOfFibonacci.size() < number) {
            int sum = arrNum[0] + arrNum[1];
            elementsOfFibonacci.add(sum);
            arrNum[0] = arrNum[1];
            arrNum[1] = sum;
        }
        return elementsOfFibonacci;
    }

    public int sumOfFibonacci(int number) {
        return calculateFibonacci(number).stream().mapToInt(Integer::intValue).sum();
    }
}
