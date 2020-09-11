package homeworks_dz6;

import java.util.Random;
import java.util.Scanner;

public class hw_task14 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter i: ");
        int a = scanner.nextInt();
        System.out.println("Enter j: ");
        int b = scanner.nextInt();
        int limit = 10;
        int min = limit;
        int max = 0;
        int [][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = random.nextInt(limit);
                System.out.print(array[i][j] + "\t");
                if (array[i][j] < min) {
                    min = array[i][j];
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                }
            System.out.println("");
            }
        System.out.println("min value = " + min);
        System.out.println("max value = " + max);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
            if (array[i][j] == min || array[i][j] == max ) {
                System.out.println(array[i][j] + " {" + i + "," + j + "}");
            }

            }
        }
        }

    }

