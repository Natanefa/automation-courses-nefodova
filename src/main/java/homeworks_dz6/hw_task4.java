package homeworks_dz6;

import java.util.Scanner;

public class hw_task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        String numbers = scanner.nextLine();
        // System.out.println(numbers);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < numbers.length(); i++) {
            //System.out.println(numbers.charAt(i));
            int num  = Character.getNumericValue(numbers.charAt(i));
           // System.out.println(num);
            if (num%2==0) {
                sum2 = sum2 + num;
            }
            else {
                sum1 = sum1 + num;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);



//        int evenSum = evenSum(number);
//        int oddSum = oddSum(number);
//        System.out.println(evenSum + oddSum);
//    }
//    public static int evenSum(String number) {
//        int evenSum = 0;
//        for (int i = 0; i < number.length(); ++i) {
//            int x = number.charAt(i) - '0';
//
//            if (x % 2 == 0) {
//                ++evenSum;
//            }
//        }
//        return evenSum;
//    }
//    public static int oddSum(String number) {
//        int oddSumm = 0;
//        for (int i = 0; i < number.length(); ++i) {
//            int x = number.charAt(i) - '0';
//
//            if (x % 2 == 1) {
//                oddSumm += x;
//            }
//        }
//        return oddSumm;
//    }

    }
}