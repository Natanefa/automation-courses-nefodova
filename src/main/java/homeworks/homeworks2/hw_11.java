package homeworks.homeworks2;

public class hw_11 {
    public static void main(String[] args) {
        double x = 10;
        double tan = Math.tan(5 * x);
        double res1 = Math.acos(tan / Math.PI);
        double res2 = (Math.pow(x, 3.2)) / 28;
        double res = res1 + res2;

        System.out.println(res);
    }
}
