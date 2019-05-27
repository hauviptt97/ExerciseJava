import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise14Test {
    @Test
    public void test_sqrt(){
        assertEquals((new Exercise14()).sqrt(3),1.7320508100147274);
        assertEquals((new Exercise14()).sqrt(-3),0.0);
    }
}