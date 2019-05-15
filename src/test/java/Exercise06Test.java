import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise06Test {
    @Test
    public void test_SolveTheQuadraticEquation() {
        assertEquals((new Exercise06()).SolveTheQuadraticEquation(1,-1,-6),"root1 = 3.0 and root2 = -2.0");
        assertEquals((new Exercise06()).SolveTheQuadraticEquation(1,-2,1),"root1 = root2 = 1.0");
        assertEquals((new Exercise06()).SolveTheQuadraticEquation(1,1,6),"pt vo nghiem");
        assertEquals((new Exercise06()).SolveTheQuadraticEquation(0,1,-6),"root1 = 6.0");
        assertEquals((new Exercise06()).SolveTheQuadraticEquation(0,0,-6),"pt vo nghiem");
    }
}
