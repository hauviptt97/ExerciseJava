import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exercise16Test {
    @Test
    public void test_getTriangle() {
        assertEquals((new Exercise16()).getDescribleTriangle(1, 3, 2, 1, 3, 4), "Kieu tam giac : tam giac can\n" +
                "Dien tich tam giac : 2.500000000000001\n" +
                "Chu vi tam giac : 7.63441361516796");
        assertEquals((new Exercise16()).getDescribleTriangle(4, 2, 3, 6, 7, -1), "Kieu tam giac : tam giac binh thuong\n" +
                "Dien tich tam giac : 4.500000000000001\n" +
                "Chu vi tam giac : 16.428004061035494");
        assertEquals((new Exercise16()).getDescribleTriangle(2, 3, 2, 8, 2, 1), "khong phai la tam giac");

        assertEquals((new Exercise16()).getDescribleTriangle(0, 0, 0, 3, 6, 0), "Kieu tam giac : tam giac vuong\n" +
                "Dien tich tam giac : 9.0\n" +
                "Chu vi tam giac : 15.70820393249937");
        assertEquals((new Exercise16()).getDescribleTriangle(-3, 0, 0, 3 * Math.sqrt(3), 3, 0), "Kieu tam giac : tam giac deu\n" +
                "Dien tich tam giac : 15.588457268119896\n" +
                "Chu vi tam giac : 18.0");

    }
}
