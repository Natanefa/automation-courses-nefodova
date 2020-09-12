package lections.lesson3;

public class les3_1 {
    public static void main(String[] args) {
        double t1 = 113.0;
        double t2 = 130.0;
        int discount = 7;
        double res = (t1 + t2) * ((100 - discount) / 100) + t2;

        System.out.println(res);
    }
}
