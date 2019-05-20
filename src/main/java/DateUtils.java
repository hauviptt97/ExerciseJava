import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static boolean isValidYear(int year) {
        return year >= 1900 && year <= 3000;
    }

    public static boolean isValidMonth(int month) {
        return month >= 1 && month <= 12;
    }

    public static int getDay(String input) {
        String[] date = input.split("[/]");
        return Integer.valueOf(date[0]);
    }

    public static int getMonth(String input) {
        String[] date = input.split("[/]");
        return Integer.valueOf(date[1]);
    }

    public static int getYear(String input) {
        String[] date = input.split("[/]");
        return Integer.valueOf(date[2]);
    }

    public static boolean isValidDay(int day, int numberOfDayInMonth) {
        return day >= 1 && day <= numberOfDayInMonth;
    }


    public static Date convertStringToDate(String input, SimpleDateFormat sdf) {
        Date result = null;
        try {
            result = sdf.parse(input);
        } catch (ParseException ignored) {

        }
        return result;
    }

    public static boolean isValidDate(String input, SimpleDateFormat sdf) {
        if (convertStringToDate(input, sdf) != null) {
            int day = getDay(input);
            int month = getMonth(input);
            int year = getYear(input);
            if (isValidYear(year)) {
                if (isValidMonth(month)) {
                    return isValidDay(day, getNumberOfDayInMonth(month, year));
                }
            }
        }
        return false;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static int getNumberOfDayInMonth(int month, int year) {
        int[] daysOfMonths = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day = daysOfMonths[month - 1];

        return (month == 2 && isLeapYear(year)) ? (day + 1) : day;
    }

    public static int getNumberOfDayInYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }
}
