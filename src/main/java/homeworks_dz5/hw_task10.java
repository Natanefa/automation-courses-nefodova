package homeworks_dz5;

import java.util.Scanner;

public class hw_task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter second number: ");
        int y = scanner.nextInt();
        System.out.println("Enter operation (available operation: +, -, *, / ) ");
        String operation = scanner.next();
        if (operation.equals("+")) {
            System.out.println("x + y = " + (x + y));}
        if (operation.equals("-")) {
            System.out.println("x - y = " + (x - y));}
        if (operation.equals("*")) {
            System.out.println("x * y = " + (x * y));}
        if (operation.equals("/") && y != 0) {
            System.out.println("x / y = " + (x / y));}
        else System.out.println("Enter valid data");
    }
}