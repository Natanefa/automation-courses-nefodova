package homeworks.homeworks2;

public class hw_14 {
    public static void main(String[] args) {
        double x = 100;
        double res1 = Math.asin(Math.log10(x) / (Math.pow(x, 2) + 5 * x +1));
        double res2 = (Math.pow(x, 3.2)) / 28;
        double res = res1 - res2;

        System.out.println(res);
    }
}
