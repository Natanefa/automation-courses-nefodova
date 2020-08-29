package homeworks_dz5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class hw_task7 {
    public static void main(String[] args) {
        // первый месяц с числом 0, т.е. январь = 0, фераль = 1 и т.д. поэтому вводится дополнительно корректирующая переменная
        int number = 5;
        int month = --number;
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month);
        int numDays = calendar.getActualMaximum(Calendar.DATE);
        System.out.println(numDays);
    }
}
