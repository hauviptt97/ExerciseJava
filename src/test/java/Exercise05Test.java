import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise05Test {
    @Test
    public void test_AnalyzeNumber(){
        assertEquals(new Exercise05().calculateFibonacy(5),"1 1 2 3 5");
    }
}
