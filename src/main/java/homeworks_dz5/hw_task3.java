package homeworks_dz5;

public class hw_task3 {
    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        int c = 36;
        int d = 87;
        int x = 0;
        if (a<b &a<c&a<d) x = a;
        else if (b<a&b<c&b<d)x = b;
        else if (c<a&c<b&c<d)x = c;
        else if (d<b&d<c&d<a)x = d;
        System.out.println(x);

        if ((a < b) && (a < c) && (a < d)) {
            System.out.println(a + " - наименьшее");
        } else if ((b < a) && (b < c) && (b < d)) {
            System.out.println(b + " - наименьшее");
        } else if ((c < a) && (c < b) && (c < d)) {
            System.out.println(c + " - наименьшее");
        } else if ((d < a) && (d < b) && (d < c)) {
            System.out.println(d + "  наименьшее");
        }

    }
    }

