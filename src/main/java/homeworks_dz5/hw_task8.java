package homeworks_dz5;

import java.util.Calendar;

public class hw_task8 {
    public static void main(String[] args) {
        int year = 2020;
        int month = 2;
        int month_right = --month;
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month_right);
        int numDays = calendar.getActualMaximum(Calendar.DATE);
        System.out.println(numDays);
    }
}
