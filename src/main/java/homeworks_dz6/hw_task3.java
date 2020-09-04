package homeworks_dz6;

import java.util.Scanner;

public class hw_task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        int num = scanner.nextInt();
        System.out.println(calculateFactorial(num));
    }

    static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}



