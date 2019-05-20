import java.util.ArrayList;
import java.util.List;

public class Exercise24 {
    public int amountOfFibonacciNumbers(int number) {
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(1);
        while (elements.get(elements.size() - 1) <= number) {
            int a = elements.get(elements.size() - 1);
            int b = elements.get(elements.size() - 2);
            elements.add(a + b);
        }
        return elements.size() - 1;
    }
}

