import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exsercise02Test {
    @Test
    public void test_calTotal(){
        assertEquals((new Exercise02()).calculateSumDigits(65),11);
    }
}
