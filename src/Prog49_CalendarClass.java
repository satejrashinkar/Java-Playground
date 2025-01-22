import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Prog49_CalendarClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("getCalendarType() : " + c.getCalendarType());
        System.out.println("getTimeZone() : " + c.getTimeZone());
        System.out.println("getID() : " + c.getTimeZone().getID());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

//        System.out.println();
//        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
//        System.out.println("getCalendarType() : " + c1.getCalendarType());
//        System.out.println("getTimeZone() : " + c1.getTimeZone());
//        System.out.println("getID() : " + c1.getTimeZone().getID());

        System.out.println();
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.isLeapYear(Calendar.YEAR));
    }
}
