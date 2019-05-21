import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise20Test {
    @Test
    public void test_sumOfFibonacci() {
        assertEquals(new Exercise20().sumOfFibonacci(7), 33);
        assertEquals(new Exercise20().sumOfFibonacci(1), 1);
        assertEquals(new Exercise20().sumOfFibonacci(2), 2);
        assertEquals(new Exercise20().sumOfFibonacci(3), 4);
        assertEquals(new Exercise20().sumOfFibonacci(0), 0);
    }
}
