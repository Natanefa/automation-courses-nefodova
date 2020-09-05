package homeworks_dz6;

import java.util.Scanner;

public class hw_task6 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int x = scanner.nextInt();
            System.out.println("Enter second number: ");
            int y = scanner.nextInt();
            System.out.println("Enter operation (available operation: +, -, *, / ) ");
            String operation = scanner.next();
            if (operation.equals("0")) {
                break;
            }
            else if (y == 0 && operation.equals("/"))
            {
                System.out.println("Divided by Zero. Try again");
                continue;
            }
            else if (operation.equals("+")) {
                System.out.println("x + y = " + (x + y));
            }
            else if (operation.equals("-")) {
                System.out.println("x - y = " + (x - y));
            }
            else if (operation.equals("*")) {
                System.out.println("x * y = " + (x * y));
            }
            else if (operation.equals("/") && y != 0) {
                System.out.println("x / y = " + ((float) x / (float) y));
            } else System.out.println("Enter valid data");
        }
    }
}
