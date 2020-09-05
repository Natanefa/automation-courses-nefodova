package homeworks_dz6;

public class hw_task11 {
    public static void main(String[] args) {
        int [] myArray = {87, 113, 64, 32, 77};
        int tmp = 0;
        for (int i = 0; i < myArray.length / 2; i++) {
            tmp = myArray[myArray.length-i-1];
            myArray[myArray.length-i-1] = myArray[i];
            myArray[i] = tmp;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
