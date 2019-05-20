import java.util.ArrayList;
import java.util.List;

public class Exercise20 {
    public int sumOfFibonacci(int number) {
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(1);
        int sum = 2;
        while (elements.size() < number) {
            int a = elements.get(elements.size() - 1);
            int b = elements.get(elements.size() - 2);
            elements.add(a + b);
            sum += a + b;
        }
        return sum;
    }
}
