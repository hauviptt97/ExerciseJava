import java.util.ArrayList;
import java.util.List;

public class Exercise18 {
    public int convertNumber(int number) {
        int result = 0;
        while (number != 0) {
            result <<= 1;
            result |= number & 1;
            number >>= 1;

        }
        return result;
    }
}
