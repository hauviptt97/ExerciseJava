import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise19Test {
    @Test
    public void test_calculateTheSumOfExpression() {
        assertEquals((new Exercise19()).a(6), new int[]{1, 5, 10, 10, 5, 1});
    }
}
