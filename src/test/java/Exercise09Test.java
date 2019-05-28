import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise09Test {
    @Test
    public void test_calculatePi(){
        assertEquals((new Exercise09()).calculatePi(),3.141642593225697);
    }
}
