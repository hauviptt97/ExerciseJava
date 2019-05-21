import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise21Test {
    @Test
    public void test_getDaysLeftInMonth() {
        assertEquals((new Exercise21()).getDaysLeftInMonth("20/05/2019"), 11);
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidDate() {
        assertEquals((new Exercise21()).getDaysLeftInMonth("2005/2019"), 0);
    }
}