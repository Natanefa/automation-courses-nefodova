package homeworks_dz6;

import java.util.Scanner;

public class hw_task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = scanner.nextInt();
        int start = 1;
        int stop = 1;
        int next = 0;
        System.out.println(start);
        for (int i = 0; i < n; i++) {
            next = start + stop;
            System.out.println(next);
            start = stop;
            stop = next;
        }
    }

}
