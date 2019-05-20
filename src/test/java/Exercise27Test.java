import org.junit.Assert;
import org.junit.Test;

public class Exercise27Test {
    @Test
    public void test_countZeroInNumber() {
        Assert.assertEquals(new Exercise27().countZeroInNumber(10), 2);
        Assert.assertEquals(new Exercise27().countZeroInNumber(12), 4);

    }
}
