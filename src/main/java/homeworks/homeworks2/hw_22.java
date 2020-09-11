package homeworks.homeworks2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class hw_22 {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar(1977, 0, 30);
        Date date1 = calendar.getTime();
        Date date2 = new Date();
        System.out.println(date1);
        System.out.println(date2);
        long milliseconds = date2.getTime() - date1.getTime();
        System.out.println(milliseconds);
        long sec = milliseconds;
        long seconds = sec % 60;
        long minutes = sec % 3600 / 60;
        long hours = sec % 86400 / 3600;
        long days = sec % 86400;
        System.out.println("day " + days + " " + "hour " + hours + " " + "minutes " + minutes + " " + "seconds " + seconds);

    }

    }









