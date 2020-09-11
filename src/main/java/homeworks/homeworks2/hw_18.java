package homeworks.homeworks2;

public class hw_18 {
    public static void main(String[] args) {
        double x = 10;
        double res1 = Math.log(Math.abs(Math.sin(x)));
        double res2 = 2 * (Math.pow(Math.E, x));
        double res3 = 2 * Math.cos(Math.abs(x));
        double res = res1 + res2 +res3 +2;

        System.out.println(res);
    }
}
