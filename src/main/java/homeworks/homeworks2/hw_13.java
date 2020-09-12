package homeworks.homeworks2;

public class hw_13 {
    public static void main(String[] args) {
    double x= 1;
    double res1 = Math.log10(x);
    double res2 = Math.pow(res1, 1.0/4);
    double res3 = Math.acos(x + 3);
    double res5 = res2 + res3;
    double res4 = 1.0 / Math.abs(x + (2 * Math.pow(x, 2)));
    double res = res5 * res4;

        System.out.println(res);
    }
}
