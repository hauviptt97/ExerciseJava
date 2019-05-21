import org.junit.Assert;
import org.junit.Test;

public class Exercise25Test {
    @Test
    public void test_countFibonacciNumbers() {
        Assert.assertEquals(new Exercise25().countFibonacciNumbers(1,5), 5);
        Assert.assertEquals(new Exercise25().countFibonacciNumbers(2,14), 5);
        Assert.assertEquals(new Exercise25().countFibonacciNumbers(2,13), 5);
    }
}