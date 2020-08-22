package homeworks.homeworks2;

public class hw_20 {
    public static void main(String[] args) {
        double m = 10;
        double convert_inch = m * 39.37;
        double inch = 10;
        double convert_m = inch / 39.37;
        System.out.println("inch = " + convert_inch);
        System.out.println("meter = " + convert_m);

        double mi = 10;
        double convert_km = 1.609 * mi;
        double convert_mi = convert_km/ 1.609;
        System.out.println("km = " + convert_km);
        System.out.println("mi = " + convert_mi);

        double kg = 10;
        double convert_ft = kg * 2.2046;
        double convert_kg = convert_ft;
        System.out.println("ft = " + convert_ft);
        System.out.println("kg = " + convert_kg);


        double speed_km = 50;
        double speed_mi = speed_km * 39.37;

        System.out.println("speed km/h = " + speed_km);
        System.out.println("speed mi/h = " + speed_mi);


    }
}
