
import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.TestCase.assertEquals;

public class Exercise08Test {
    @Test
    public void test_calculateFactorial(){

        assertEquals((new Exercise08()).calculateFactorial(new BigInteger("100")),new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"));
    }
}