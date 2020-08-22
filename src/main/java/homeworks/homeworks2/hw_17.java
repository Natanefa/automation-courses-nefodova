package homeworks.homeworks2;

public class hw_17 {
    public static void main(String[] args) {
        double x = 10;
        double res1 = (Math.pow(x, 3.4) + 2.5 * Math.pow(x, 1.2) - 0.7) / (Math.cbrt(Math.pow(Math.E, 2.5*x)));
        double res2 = Math.log10(Math.acos(res1));
        double res3 = Math.pow(res2, 1.0/4);
        double res = res3 + 1;

        System.out.println(res2);
    }
}
