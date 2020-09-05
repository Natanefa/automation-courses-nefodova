package homeworks_dz6;

import java.util.Random;

public class hw_task9 {
    public static void main(String[] args) {
        int [] myArray = {8, 92, 8, 6, -5, 7, 6,-9, 11, -13};
        int skip = 1;
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
            if (myArray[i] < 0 && skip==1){
                skip=0;
                System.out.println(myArray[i]);
            }
            if (skip==1) continue;
            sum = sum + Math.abs(myArray[i]);
        }
        System.out.println(sum);


        }
    }

