import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise10Test {
    @Test
    public void test_calculatePi(){
        assertEquals((new Exercise10()).calculatePi(),3.1415972089789648);
    }
}