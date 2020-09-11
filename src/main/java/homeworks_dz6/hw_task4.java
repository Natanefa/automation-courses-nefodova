package homeworks_dz6;

import java.util.Scanner;

public class hw_task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        String numbers = scanner.nextLine();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < numbers.length(); i++) {
            int num  = Character.getNumericValue(numbers.charAt(i));
                if (num%2==0) {
                sum2 = sum2 + num;
            }
            else {
                sum1 = sum1 + num;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}