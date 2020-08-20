package homeworks.homeworks2;

public class hw_4 {
    public static void main(String[] args) {
        double x = 10;
        double a = Math.log(Math.sqrt(Math.abs(2-x) + 1.2));
        double b = 1.0 / (2 + (Math.pow(Math.E, x)));
        double c = Math.cbrt(2.0 / x);
        double res= a * b + c;

        System.out.println(res);
    }
}
