import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise01Test {

    @Test
    public void test_findGCD(){
        assertEquals((new Exercise01()).findGCD(12,22),2);
        assertEquals((new Exercise01()).findGCD(0,25),25);
        assertEquals((new Exercise01()).findGCD(20,0),20);
        assertEquals((new Exercise01()).findGCD(0,0),0);
    }

    @Test
    public void test_findLCM(){
        assertEquals((new Exercise01()).findLCM(65, 10),130);
    }
}
