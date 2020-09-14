package homework_dz7;

import java.util.Scanner;

public class hw_task1_1 {

    public static double celcius2kelvin(double temp){
        return temp = temp + 273.16;
    }

    public static double kelvin2celcius(double temp){
        return temp - 273.16;
    }

    public static double celcius2fahrenheit(double temp){
        return  temp = (temp * (9.0/5.0)) + 32;
    }

    public static double fahrenheit2celsius(double temp){
        return  temp = (temp - 32.0) * (5.0/9.0);
    }

    public static double meters2inches(double meter){
        return  meter = meter * 39.37;
    }

    public static double inches2meter(double meter){
       return meter = meter / 39.37;
    }

    public static double miles2kilometer(double mile){
       return mile = mile * 1.609;
    }

    public static double kilometer2meter(double km){
       return km = km * 1000;
    }

    public static double phounds2kg(double phounds){
        return  phounds = phounds / 2.205;
    }

    public static double kg2phounds(double phounds){
        return phounds = phounds * 2.194;
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


    }

}



