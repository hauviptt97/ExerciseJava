import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.TestCase.assertEquals;

public class Exercise18Test {
    @Test
    public void test_convertNumber(){
        assertEquals((new Exercise18()).convertNumber(-23),29);
    }
}
