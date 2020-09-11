package homeworks_dz6;

import java.util.Scanner;
public class hw_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a minimum value: ");
        int min = scanner.nextInt();
        System.out.println("Please, enter a maximum value: ");
        int max = scanner.nextInt();
        System.out.println("Please, enter a step value: ");
        int step = scanner.nextInt();
        for (int i = min; i <=  max; i = i + step){
            System.out.println(i);
        }

    }
}
