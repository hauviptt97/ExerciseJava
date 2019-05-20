import java.text.SimpleDateFormat;

public class Exercise22 {

    private int getDaysOfYear(int day, int month, int year) {
        int days = 0;
        for (int i = 1; i < month; i++) {
            days += DateUtils.getNumberOfDayInMonth(i, year);
        }
        return days + day;
    }

    public int getDaysLeftOfYear(String inputDate) {
        int days;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (DateUtils.isValidDate(inputDate, sdf)) {
            int day = DateUtils.getDay(inputDate);
            int month = DateUtils.getMonth(inputDate);
            int year = DateUtils.getYear(inputDate);

            days = DateUtils.getNumberOfDayInYear(year) - getDaysOfYear(day, month, year);
        } else {
            throw new RuntimeException("Invalid date");
        }
        return days;
    }
}