package homeworks.homeworks2;

public class hw_6 {
    public static void main(String[] args) {
        double x = 1;
        double fun1 = Math.sin(x/2);
        double fun2 = Math.pow(fun1, 3);
        double a = Math.sqrt(fun2);

        double s = 1.3 * x;
        double fun3 = Math.pow(Math.E, s);
        double fun4 = Math.pow(Math.E, (-s));
        double fun5 = Math.cbrt(fun3 + fun4);

        double fun6 = 1 / (Math.abs(x + 5.0/2.0));

        double res = a * fun5 * fun6;



        System.out.println(res);
    }
}
