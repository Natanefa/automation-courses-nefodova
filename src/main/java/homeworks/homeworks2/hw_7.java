package homeworks.homeworks2;

public class hw_7 {
    public static void main(String[] args) {
        double x = 10;
        double res1 = (Math.abs(x * Math.log(x) - 4)) * Math.sqrt(x);
        double res2 = 1 / (Math.pow((Math.pow((Math.E), 4*x)), 1.0/5));

        double res = res1 * res2;


        System.out.println(res);
    }
}
