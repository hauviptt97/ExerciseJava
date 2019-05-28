import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise26Test {
    @Test
    public void test_calculateTheSumOfExpression(){
        assertEquals((new Exercise26()).getCrazyFibonacci(new int[]{6,2,2,1,4},7),4);
        assertEquals((new Exercise26()).getCrazyFibonacci(new int[]{6,2,2,1,4},6),5);
        assertEquals((new Exercise26()).getCrazyFibonacci(new int[]{6,2,2,1,4},4),1);
        assertEquals((new Exercise26()).getCrazyFibonacci(new int[]{6,2,2,1,4},0),0);
    }
}
