package homeworks.homeworks2;

public class hw_16 {
    public static void main(String[] args) {
        double x = 10;
        double res1 = Math.abs((8.3 - 21 * (Math.pow(x, 2)) - 0.8 * x));
        double res2 = Math.cbrt(2.5 + 1 / Math.pow(x, 2));
        double res =  Math.atan(res1 / res2);

        System.out.println(res);
    }
}
