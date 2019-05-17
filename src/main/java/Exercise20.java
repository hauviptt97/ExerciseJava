import java.util.ArrayList;
import java.util.List;

public class Exercise20 {
    private List<Integer> calculateFibonacci(int number) {
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(1);
        while (elements.size() < number) {
            int a = elements.get(elements.size()-1);
            int b = elements.get(elements.size()-2);
            elements.add(a+b);
        }
        return elements;
    }

    public int sumOfFibonacci(int number) {
        return calculateFibonacci(number).stream().mapToInt(Integer::intValue).sum();
    }
}
