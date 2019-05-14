import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise04Test {
    @Test
    public void test_AnalyzeNumber(){
        assertEquals(new Exercise04().AnalyzeNumber(600),"2^3 * 3 * 5^2");
    }
}
