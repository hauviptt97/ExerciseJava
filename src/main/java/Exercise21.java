import java.text.SimpleDateFormat;

public class Exercise21 {
    public int getDaysLeftInMonth(String inputDate) {
        int days;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (DateUtils.isValidDate(inputDate, sdf)) {
            int day = DateUtils.getDay(inputDate);
            int month = DateUtils.getMonth(inputDate);
            int year = DateUtils.getYear(inputDate);

            days = DateUtils.getNumberOfDayInMonth(month, year) - day;
        } else {
            throw new RuntimeException("Invalid date");
        }
        return days;
    }
}