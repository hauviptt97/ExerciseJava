import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.TestCase.assertEquals;

public class Exercise12Test {
    @Test
    public void test_calculateTheSumOfExpression(){
        assertEquals((new Exercise12()).calculateTheSumOfExpression(4),"2.708333333333333");
        assertEquals((new Exercise12()).calculateTheSumOfExpression(-2),"Error");
    }
}
