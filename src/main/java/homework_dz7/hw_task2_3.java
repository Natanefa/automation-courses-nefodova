package homework_dz7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hw_task2_3 {
    public static void main(String[] args) {
        Pattern pat=Pattern.compile("(\\d)\\D*(\\d)");
        Matcher matcher=pat.matcher("AX6BYU56UX6CV6BNT7NM");
        int digits = 1;
        while (matcher.find()) {
            System.out.println("numbers code: " + matcher.group(1) + matcher.group(2));
            digits = digits * Integer.parseInt(matcher.group(1) + matcher.group(2));
        };
        System.out.println("AX6BYU56UX6CV6BNT7NM" + " " + digits);
        System.out.println("");
    }
}
