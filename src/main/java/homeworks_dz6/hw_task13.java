package homeworks_dz6;

import java.util.Scanner;

public class hw_task13 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        int mult = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum = sum + array[i];
            mult = mult * array[i];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Сумма всех элементов массива = " + sum);
        System.out.println("Произведение всех элементов массива = " + mult);
    }
}
