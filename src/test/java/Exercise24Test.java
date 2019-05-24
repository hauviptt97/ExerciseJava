import org.junit.Assert;
import org.junit.Test;

public class Exercise24Test {
    @Test
    public void test_sumOfFibonacci() {
        Assert.assertEquals(new Exercise24().countFibonacciNumbers(8), 6);
        Assert.assertEquals(new Exercise24().countFibonacciNumbers(2), 3);
        Assert.assertEquals(new Exercise24().countFibonacciNumbers(1), 2);
        Assert.assertEquals(new Exercise24().countFibonacciNumbers(0), 0);
        Assert.assertEquals(new Exercise24().countFibonacciNumbers(-2), 0);
    }
}
