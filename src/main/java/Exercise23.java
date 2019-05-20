import java.text.SimpleDateFormat;

public class Exercise23 {

    private int getDaysOfYear(int day, int month, int year) {
        int days = 0;
        for (int i = 1; i < month; i++) {
            days += DateUtils.getNumberOfDayInMonth(i, year);
        }
        return days + day;
    }

    private int getDaysOfPreviousYears(int year) {
        int days = 0;
        for (int i = 1; i < year; i += 1)
            days += DateUtils.getNumberOfDayInYear(i);
        return days;
    }

    public String getDayOfWeek(String inputDate) {
        String[] dayOfWeek = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int dayTotal;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (DateUtils.isValidDate(inputDate, sdf)) {
            int day = DateUtils.getDay(inputDate);
            int month = DateUtils.getMonth(inputDate);
            int year = DateUtils.getYear(inputDate);

            dayTotal = getDaysOfPreviousYears(year) + getDaysOfYear(day, month, year);
        } else {
            throw new RuntimeException("Invalid date");
        }
        return dayOfWeek[dayTotal % 7];
    }
}
