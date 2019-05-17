import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;

public class DateUtilsTest {
    @Test
    public void test_isValidYear() {
        assertEquals(DateUtils.isValidYear(1889), false);
        assertEquals(DateUtils.isValidYear(3001), false);
        assertEquals(DateUtils.isValidYear(2019), true);
    }

    @Test
    public void test_isValidMonth() {
        assertEquals(DateUtils.isValidMonth(0), false);
        assertEquals(DateUtils.isValidMonth(13), false);
        assertEquals(DateUtils.isValidMonth(5), true);
    }

    @Test
    public void test_isValidDay() {
        assertEquals(DateUtils.isValidDay(0, 31), false);
        assertEquals(DateUtils.isValidDay(32, 31), false);
        assertEquals(DateUtils.isValidDay(17, 31), true);
    }

    @Test
    public void test_isLeapYear() {
        assertEquals(DateUtils.isLeapYear(2012), true);
        assertEquals(DateUtils.isLeapYear(2000), true);
        assertEquals(DateUtils.isLeapYear(2019), false);
        assertEquals(DateUtils.isLeapYear(3000), false);
    }

    @Test
    public void test_getNumberOfDayInMonth() {
        assertEquals(DateUtils.getNumberOfDayInMonth(1, 2019), 31);
        assertEquals(DateUtils.getNumberOfDayInMonth(3, 2019), 31);
        assertEquals(DateUtils.getNumberOfDayInMonth(5, 2019), 31);
        assertEquals(DateUtils.getNumberOfDayInMonth(7, 2019), 31);
        assertEquals(DateUtils.getNumberOfDayInMonth(8, 2019), 31);
        assertEquals(DateUtils.getNumberOfDayInMonth(10, 2019), 31);
        assertEquals(DateUtils.getNumberOfDayInMonth(12, 2019), 31);
        assertEquals(DateUtils.getNumberOfDayInMonth(4, 2019), 30);
        assertEquals(DateUtils.getNumberOfDayInMonth(6, 2019), 30);
        assertEquals(DateUtils.getNumberOfDayInMonth(9, 2019), 30);
        assertEquals(DateUtils.getNumberOfDayInMonth(11, 2019), 30);
        assertEquals(DateUtils.getNumberOfDayInMonth(2, 2011), 28);
        assertEquals(DateUtils.getNumberOfDayInMonth(2, 2012), 29);
    }

    @Test
    public void test_getNumberOfDayInYear() {
        assertEquals(DateUtils.getNumberOfDayInYear(2019), 365);
        assertEquals(DateUtils.getNumberOfDayInYear(2012), 366);
    }

    @Test
    public void test_convertStringToDate() {
        String inputString1 = "17/05/2019";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date inputDate1 = null;
        try {
            inputDate1 = dateFormat.parse(inputString1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        assertEquals(DateUtils.convertStringToDate("17/05/2019", new SimpleDateFormat("dd/MM/yyyy")), inputDate1);
        assertEquals(DateUtils.convertStringToDate("17305/3001", new SimpleDateFormat("dd/MM/yyyy")), null);
    }

    @Test
    public void test_isValidDate() {
        assertEquals(DateUtils.isValidDate("17/05/1888"), false);
        assertEquals(DateUtils.isValidDate("17/14/2019"), false);
        assertEquals(DateUtils.isValidDate("32/05/2019"), false);
        assertEquals(DateUtils.isValidDate("17/05/2019"), true);
    }
}
