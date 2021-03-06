package homework_dz9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeLogger {
    public static int counter = 1;

    public String log(String operation) {

        Date curDate = new Date();
        curDate.getTime();
        String formateDate = new SimpleDateFormat("HH:mm:ss.SSS").format(curDate.getTime());

        return counter + ")" + formateDate + "[" + Thread.currentThread().getName() + "] : " + operation;
    }
}
