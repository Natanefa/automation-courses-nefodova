package homeworks.homeworks2;

public class hw_10 {
    public static void main(String[] args) {
        double x = 10;
        double res1 = ((Math.abs(7.2 - 10 * x)) / Math.cbrt((Math.pow(x, 2)) + Math.pow(Math.E, x)));
        double res2 = ((4 * (x / 3)) / Math.atan(Math.sqrt((Math.pow(1.1, 3))) + Math.pow(x, 2)));
        double res = res1 * res2;

        System.out.println(res);
    }
}
