import org.junit.Assert;
import org.junit.Test;

public class Exercise19Test {
    @Test
    public void test_calculateTheSumOfExpression() {
        Assert.assertArrayEquals((new Exercise19()).getLastLineInPascalTriangle(100), new long[]{1, 5, 10, 10, 5, 1});
    }
}
