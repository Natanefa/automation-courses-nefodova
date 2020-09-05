package homeworks_dz6;

import java.util.Random;

public class hw_task12 {
    public static void main(String[] args) {
        Random random = new Random(0);
        int [] array = new int [20];
        int min = -5;
        int max = 4;
        int diff = max - min;
        int sumPositive = 0;
        int sumNegative = 0;
        int sumZero = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(diff);
            array[i] = array[i] + min;
            if (array[i] < 0) {
                sumPositive = sumPositive + 1;
            }
            else if (array[i] > 0) {
                sumNegative = sumNegative + 1;
            }
            else {
                sumZero = sumZero + 1;
            }
        }
        System.out.println(sumPositive);
        System.out.println(sumNegative);
        System.out.println(sumZero);
    }
}
