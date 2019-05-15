import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise07Test {
    @Test
    public void test_calculateTheSumOfExpression(){
        assertEquals((new Exercise07()).calculateTheSumOfExpression(5),70);
    }
}