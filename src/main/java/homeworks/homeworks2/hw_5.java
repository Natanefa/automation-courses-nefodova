package homeworks.homeworks2;

public class hw_5 {
    public static void main(String[] args) {
        double x = 10;
        double b = -2 + x;
        double a = Math.pow(Math.pow(Math.E, b),1.0/5);
        double c = Math.sqrt((Math.pow(x, 2)) + (Math.pow(x, 4) - (Math.log(Math.abs(x - Math.PI)))));

        double res= a * (1.0 / c);

        System.out.println(res);
    }
}
