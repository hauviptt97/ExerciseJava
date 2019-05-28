import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise30Test {
    @Test
    public void test_convertDecimalToRoman() {
        assertEquals(new Exercise30().convertDecimalToRoman(1234), "MCCXXXIV");
        assertEquals(new Exercise30().convertDecimalToRoman(680), "DCLXXX");
        assertEquals(new Exercise30().convertDecimalToRoman(635), "DCXXXV");
        assertEquals(new Exercise30().convertDecimalToRoman(89), "LXXXIX");
        assertEquals(new Exercise30().convertDecimalToRoman(0), "Invalid Number");
        assertEquals(new Exercise30().convertDecimalToRoman(4000), "Invalid Number");
        assertEquals(new Exercise30().convertDecimalToRoman(3999), "MMMCMXCIX");
        assertEquals(new Exercise30().convertDecimalToRoman(20), "XX");
        assertEquals(new Exercise30().convertDecimalToRoman(27), "XXVII");
    }
}
