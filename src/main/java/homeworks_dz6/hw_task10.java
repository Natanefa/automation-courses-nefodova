package homeworks_dz6;

public class hw_task10 {
    public static void main(String[] args) {
    int [] array = {15546, 8};
    int sum = 0;
    int digit = 0;

    for (int i = 0; i < array.length; i++) {
        array[i] = Math.abs(array[i]);
        while (array[i]>0) {
            digit = array[i]%10;
            array[i] = array[i] / 10;
            sum = sum + digit;
            System.out.println(digit);
        }
        }

    System.out.println(sum);
    }
}
