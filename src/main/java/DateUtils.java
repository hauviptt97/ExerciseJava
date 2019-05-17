import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        int num = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                num = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                num = 30;
                break;

            case 2:
                if (isLeapYear(year)) {
                    num = 29;
                } else {
                    num = 28;
                }
                break;
        }
        return num;
    }

    public static int getNumberOfDayInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }
}
