import org.junit.Assert;
import org.junit.Test;

public class Exercise24Test {
    @Test
    public void test_sumOfFibonacci() {
        Assert.assertEquals(new Exercise24().countFibonacciNumbers(8), 6);
    }
}
