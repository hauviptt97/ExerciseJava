import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise11Test {
    @Test
    public void test_calculateMoney(){
        assertEquals((new Exercise11()).calculateMoney(2),225.0);
        assertEquals((new Exercise11()).calculateMoney(0),200.0);
    }
}
