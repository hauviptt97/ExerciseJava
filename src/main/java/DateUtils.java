import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DateUtils {

    public static boolean isValidYear(int year) {
        return (year < 1900 || year > 3000) ? false : true;
    }

    public static boolean isValidMonth(int month) {
        return (month < 1 || month > 12) ? false : true;
    }

    public static boolean isValidDay(int day, int numberOfDayInMonth) {
        return (day < 1 || day > numberOfDayInMonth) ? false : true;
    }


    public static Date convertStringToDate(String input, SimpleDateFormat sdf) {
        Date result = null;
        sdf.setLenient(false);
        try {
            result = sdf.parse(input);
        } catch (ParseException e) {

        }
        return result;
    }

    public static boolean isValidDate(String input) {
        String[] date = input.split("[/]");
        int day = Integer.valueOf(date[0]);
        int month = Integer.valueOf(date[1]);
        int year = Integer.valueOf(date[2]);
        if (isValidYear(year)) {
            if (isValidMonth(month)) {
                if (isValidDay(day, getNumberOfDayInMonth(month, year))) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    return true;
                else
                    return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int getNumberOfDayInMonth(int month, int year) {
        List<Integer> monthsHave31Days = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        List<Integer> monthsHave30Days = Arrays.asList(4, 6, 9, 11);

        if (monthsHave31Days.contains(month)) {
            return 31;
        }
        if (monthsHave30Days.contains(month)) {
            return 30;
        }

        return isLeapYear(year) ? 29 : 28;
    }

    public static int getNumberOfDayInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }
}
