import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise19Test {
    @Test
    public void test_calculateTheSumOfExpression() {
        Assert.assertArrayEquals((new Exercise19()).getLastLineInPascalTriangle(6), new int[]{1, 5, 10, 10, 5, 1});
    }
}
