import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise03Test {
    @Test
    public void test_AnalyzeNumber(){
        assertEquals(new Exercise03().AnalyzeNumber(600),"2 * 2 * 2 * 3 * 5 * 5");
    }
}
