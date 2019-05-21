import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise29Test {
    @Test
    public void test_getNumberByRomanLetter() {
        assertEquals(new Exercise29().getNumberByRomanLetter("DCLXXX"), 680);
        assertEquals(new Exercise29().getNumberByRomanLetter("DCXXXV"), 635);
        assertEquals(new Exercise29().getNumberByRomanLetter("LXXXIX"), 89);
        assertEquals(new Exercise29().getNumberByRomanLetter("LXXXXXIX"), 0);
    }
}
