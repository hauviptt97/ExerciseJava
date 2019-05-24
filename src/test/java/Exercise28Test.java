import junit.framework.TestCase;
import org.junit.Test;

public class Exercise28Test {
    @Test
    public void test_sqrt(){
        TestCase.assertEquals(new Exercise28().sqrt(4),1.9999990463256836);
        TestCase.assertEquals(new Exercise28().sqrt(-4),0.0);
    }

}
