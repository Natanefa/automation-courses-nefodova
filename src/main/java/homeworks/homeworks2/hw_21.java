package homeworks.homeworks2;

public class hw_21 {
    public static void main(String[] args) {
        long sec = 9879644;
        long seconds = sec % 60;
        long minutes = sec % 3600 / 60;
        long hours = sec % 86400 / 3600;
        long days = sec % 86400;

        System.out.println("day" + days + "hour" + hours + "minutes" + minutes + "seconds" + seconds);
    }
}
