import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise22Test {
    @Test
    public void test_getDaysLeftOfYear(){
        assertEquals((new Exercise22()).getDaysLeftOfYear("20/05/2019"),225);
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidDate() {
        assertEquals((new Exercise22()).getDaysLeftOfYear("2005/2019"),0);
    }
}