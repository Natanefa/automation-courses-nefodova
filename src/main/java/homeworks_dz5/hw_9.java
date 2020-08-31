package homeworks_dz5;

import java.util.Scanner;

public class hw_9 {
    public static void main(String[] args) {
        int radius = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of the operation: ");
        int j = scanner.nextInt();
        if (j == 1) {
            System.out.println( "C = " + (2 * Math.PI * radius));
        } else if (j == 2) {
            System.out.println("S = " + Math.PI * Math.pow(radius, 2));
        } else if (j == 3) {
            System.out.println("V = " + 4.0 / 3.0 * (Math.PI * Math.pow(radius, 3)));}
        else System.out.println("Please, enter a valid number of the operation");
    }
}