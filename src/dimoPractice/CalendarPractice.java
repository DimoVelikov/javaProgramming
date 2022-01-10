package dimoPractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarPractice {
    public static void main(String[] args) {




        SimpleDateFormat d = new SimpleDateFormat();

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.getTime());
        System.out.println(d.format(cal.getTime()));

    }
}
