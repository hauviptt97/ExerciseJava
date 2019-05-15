import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.TestCase.assertEquals;

public class Exercise15Test {
    @Test
    public void test_getTriangle() {
        assertEquals((new Exercise15()).getTriangle(1, 3, 2), "khong phai la tam giac");
        assertEquals((new Exercise15()).getTriangle(4, 2, 3), "Kieu tam giac : tam giac binh thuong\n" +
                                                                               "Dien tich tam giac : 2.9047375096555625\n" +
                                                                               "Chu vi tam giac : 9.0");
        assertEquals((new Exercise15()).getTriangle(3, 4, 5), "Kieu tam giac : tam giac vuong\n" +
                                                                               "Dien tich tam giac : 6.0\n" +
                                                                               "Chu vi tam giac : 12.0");
        assertEquals((new Exercise15()).getTriangle(4, 4, 4), "Kieu tam giac : tam giac deu\n" +
                                                                               "Dien tich tam giac : 6.928203230275509\n" +
                                                                               "Chu vi tam giac : 12.0");
        assertEquals((new Exercise15()).getTriangle(2, 3, 2), "Kieu tam giac : tam giac can\n" +
                                                                               "Dien tich tam giac : 1.984313483298443\n" +
                                                                               "Chu vi tam giac : 7.0");
        assertEquals((new Exercise15()).getTriangle(1, 4, 4), "Kieu tam giac : tam giac can\n" +
                "Dien tich tam giac : 1.984313483298443\n" +
                "Chu vi tam giac : 9.0");

        assertEquals((new Exercise15()).getTriangle(4, 4, 1), "Kieu tam giac : tam giac can\n" +
                "Dien tich tam giac : 1.984313483298443\n" +
                "Chu vi tam giac : 9.0");
    }
}
