package homeworks.homeworks2;

public class hw_9 {
    public static void main(String[] args) {
        double x = 1;
        double res1 = (Math.pow(x, 3)) / 3.0;
        double res2 = (Math.pow((Math.E), x)) * (Math.log(Math.pow(1.3, 3) + Math.pow(x, 3)));
        double res = res1 - res2 +4.0/3.0;

        System.out.println(res);
    }
}
