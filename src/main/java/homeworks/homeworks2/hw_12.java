package homeworks.homeworks2;

public class hw_12 {
    public static void main(String[] args) {
        double x = 10;
        double res1 = Math.cbrt(Math.pow(Math.log(x), 2)) + Math.tan(Math.cos(Math.PI * x));
        double res2 = Math.log(x / 10.5) + 1.0 / 3.0;
        double res = res1 * res2;

        System.out.println(res2);
    }
}
