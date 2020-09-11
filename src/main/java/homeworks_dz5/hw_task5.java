package homeworks_dz5;

public class hw_task5 {
    public static void main(String[] args) {
            int a = 45;
            int b = 15;
            int c = 36;
            int d = 87;
            int f = 24;
            int x = 0;
            if (a<b&&a<c&&a<d&&a<f) x = a;
            else if (b<a&&b<c&&b<d&&b<f)x = b;
            else if (c<a&&c<b&&c<d&&c<f)x = c;
            else if (d<b&&d<c&&d<a&&d<f)x = d;
            else if (f<a&&f<b&&f<c&&f<d) x = f;
            System.out.println("min = " + x);
            if (a>b&&a>c&&a>d&&a>d&&a>f) x = a;
            else if (b>a&&b>c&&b>d&&b>f) x = b;
            else if (c>a&&c>b&&c>d&&c>f) x = c;
            else if (d>a&&d>b&&d>c&&d>f) x = d;
            else if (f>a&&f>b&&f>c&&f>d) x = f;
        System.out.println("max = " + x);


        if ((a < b) && (a < c) && (a < d) && (a < f)) {
            System.out.println(a + " - наименьшее");
        } else if ((b < a) && (b < c) && (b < d) && (b < f)) {
            System.out.println(b + " - наименьшее");
        } else if ((c < a) && (c < b) && (c < d) && (c < f)) {
            System.out.println(c + " - наименьшее");
        } else if ((d < a) && (d < b) && (d < c) && (d < f)) {
            System.out.println(d + "  наименьшее");
        } else if ((f < a) && (f < b) && (f < c) && (f < d)) {
            System.out.println(f + " наименьшее");
        }

        if ((a > b) && (a > c) && (a > d) && (a > f) ) {
            System.out.println(a + " - наибольшее");
        } else if ((b > a) && (b > c) && (b > d) && (b > f)) {
            System.out.println(b + " - наибольшее");
        } else if ((c > a) && (c > b) && (c > d) && (c > f)) {
            System.out.println(c + " - наибольшее");
        } else if ((d > a) && (d > b) && (d > c) && (d > f)) {
            System.out.println(d + "  наибольшее");}
          else if ((f > a) && (f > b) && (f > c) && (f > d)) {
            System.out.println(f + " наибольшее");}
    }
}
