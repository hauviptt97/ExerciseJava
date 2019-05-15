import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise03Test {
    @Test
    public void test_AnalyzeNumber(){
        assertEquals(new Exercise03().analyzeNumber(-1),"value not determined");
        assertEquals(new Exercise03().analyzeNumber(0),"0");
        assertEquals(new Exercise03().analyzeNumber(1),"1");
        assertEquals(new Exercise03().analyzeNumber(600),"2 * 2 * 2 * 3 * 5 * 5");
    }
}
