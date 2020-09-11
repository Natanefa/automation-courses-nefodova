package homeworks_dz6;

import java.util.Random;
import java.util.Scanner;

public class hw_task1 {
    public static void main(String[] args) {
    Random random = new Random();
    int num = random.nextInt(100);
    System.out.println(num);
    Scanner scanner = new Scanner(System.in);
    for (int i = 1; i <= 10; i++) {
        System.out.println("Try " + i + ". Enter a number: ");
        int input = scanner.nextInt();
        if (input == num) {
            System.out.println("Great! You are cool!");
            System.exit(0);
        }
        else if (input > num) {
            System.out.println("Entered value is biggest of right value");
        }
        else System.out.println("Entered value is less of right value");
            }
        System.out.println("Sorry, try again.");
    }
}

