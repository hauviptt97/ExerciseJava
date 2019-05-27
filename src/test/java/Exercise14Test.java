import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise14Test {
    @Test
    public void test_calculatePi(){
        assertEquals((new Exercise10()).calculatePi(),3.1415842726746206);
    }
}