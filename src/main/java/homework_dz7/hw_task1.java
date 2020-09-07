package homework_dz7;

import java.util.Scanner;

public class hw_task1 {

    public static double celcius2kelvin(double temp){
        temp = temp + 273.16;
        return temp;
    }

    public static double kelvin2celcius(double temp){
        temp = temp - 273.16;
        return temp;
    }

    public static double celcius2fahrenheit(double temp){
        temp = (temp * (9.0/5.0)) + 32;
        return temp;
    }

    public static double fahrenheit2celsius(double temp){
        temp = (temp - 32.0) * (5.0/9.0);
        return temp;
    }

    public static double meters2inches(double meter){
        meter = meter * 39.37;
        return meter;
    }

    public static double inches2meter(double meter){
        meter = meter / 39.37;
        return meter;
    }

    public static double miles2kilometer(double mile){
        mile = mile * 1.609;
        return mile;
    }

    public static double kilometer2meter(double km){
        km = km * 1000;
        return km;
    }

    public static double phounds2kg(double phounds){
        phounds = phounds / 2.205;
        return phounds;
    }

    public static double kg2phounds(double phounds){
        phounds = phounds * 2.194;
        return phounds;
    }

    public static double func(double x, double y){
        x = Math.pow(x,2);
        y = Math.pow(y,2);
        double res = x + y;
        return  res;
    }

    public static void main(String[] args) {
        double temp= 36.6;
        temp = celcius2kelvin(temp);
        System.out.println(temp);
        temp = kelvin2celcius(temp);
        System.out.println(temp);
        temp = celcius2fahrenheit(temp);
        System.out.println(temp);
        temp = fahrenheit2celsius(temp);
        System.out.println(temp);
        System.out.println(" ");

        double meter = 35;
        meter = meters2inches(meter);
        System.out.println(meter);
        meter = inches2meter(meter);
        System.out.println(meter);
        System.out.println(" ");

        double mile = 55;
        mile = miles2kilometer(mile);
        System.out.println(mile);
        System.out.println(" ");

        double km = 1378;
        km = kilometer2meter(km);
        System.out.println(km);
        System.out.println(" ");

        double phounds = 65.3;
        phounds = phounds2kg(phounds);
        System.out.println(phounds);
        phounds = kg2phounds(phounds);
        System.out.println(phounds);


        double x = 4;
        double y = 4;
        double res = func(x, y);
        System.out.println(res);
    }

}



