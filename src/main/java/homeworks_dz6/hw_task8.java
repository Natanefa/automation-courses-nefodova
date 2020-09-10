package homeworks_dz6;

public class hw_task8 {
    public static void main(String[] args) {
        int [] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int [] resArray = new int[myArray.length];
        int start = 4;
        int stop = 13;
        int resIndex = 0;

        for (int i = 0; i < 20; i++) {
            if (i >= start && i <= stop){
            continue;
            }
            resArray[resIndex] = myArray[i];
            resIndex++;
        }

        for (int i = resIndex; i < resArray.length; i++) {
            resArray[i] = 0;
        }

        for (resIndex = 0; resIndex < 20; resIndex++) {
            System.out.println(resIndex + " " + resArray[resIndex]);
        }
    }
}
