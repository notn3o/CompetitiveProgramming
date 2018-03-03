import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class JavaDateAndTime {
    public static String getDay(String day, String month, String year) {
        Calendar c = new GregorianCalendar(Integer.valueOf(year), Integer.valueOf(month) - 1, Integer.valueOf(day));
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case Calendar.SUNDAY: return "SUNDAY";
            case Calendar.MONDAY: return "MONDAY";
            case Calendar.TUESDAY: return "TUESDAY";
            case Calendar.WEDNESDAY: return "WEDNESDAY";
            case Calendar.THURSDAY: return "THURSDAY";
            case Calendar.FRIDAY: return "FRIDAY";
            case Calendar.SATURDAY: return "SATURDAY";
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        String day = sc.next();
        String year = sc.next();
        System.out.println(getDay(day, month, year));
    }
}
