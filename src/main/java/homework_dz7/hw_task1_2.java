package homework_dz7;

public class hw_task1_2 {
    public static void main(String[] args) {
        double x = 4;
        double y = 4;
        double c = 5;
        double res = func(x, y);
        System.out.println(res + c);
    }
    public static double func(double x, double y){
        x = Math.pow(x,2);
        y = Math.pow(y,2);
        double res = x + y ;
        return  res;
    }
}
