package homeworks.homeworks2;

public class hw_3 {
    public static void main(String[] args) {
        double x = 10;
        double a = 2 * Math.PI * x;
        double b = Math.abs(Math.sin(Math.sqrt(10.5 * x)));
        double c = Math.cbrt(Math.pow(x, 2));
        double d = 1.0/ 7.0;
        double f = 1.0 / (c + d);
        double res = a - b * f;

        System.out.println(res);
    }
}
