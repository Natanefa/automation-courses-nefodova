package lections;

public class lection6 {
    public static void main(String[] args) {
int [] arrayInt = {1,2,3,4,5,6,7,8,9,10};
int [] resArray = new int [arrayInt.length];
int start = 5;
int stop = 7;
int lastIndex = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            if (i < start || i > stop) {
                resArray[lastIndex] = arrayInt[i];
                lastIndex++;

                System.out.println(lastIndex);
            }
        }
    }
}
