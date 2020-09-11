package homeworks.homeworks2;

public class hw_8 {
    public static void main(String[] args) {
        double x = 1;
        double res1 = Math.cbrt((Math.pow((Math.E), 2*x)) * (Math.sqrt(x)) * ((x + 1.0/3.0)/x));
        double res2 = Math.abs(Math.cos(2.5 * x));
        double res = res1 * res2;

        System.out.println(res);
    }
}
