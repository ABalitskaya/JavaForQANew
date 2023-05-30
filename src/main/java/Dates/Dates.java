package Dates;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Dates {
    public static void main(String[] args) {
        Date date0 = new Date();
        //System.out.println(date0);


        Calendar c1 = new GregorianCalendar(Locale.getDefault());
        c1.setTime(date0);
        c1.add(Calendar.HOUR_OF_DAY, 111);
        System.out.println(c1.getTime());
    }
}
