import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise23Test {
    @Test
    public void test_getDayOfWeek(){
        assertEquals((new Exercise23()).getDayOfWeek("21/05/2019"),"Tuesday");
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidDate() {
        assertEquals((new Exercise23()).getDayOfWeek("2005/2019"),0);
    }
}