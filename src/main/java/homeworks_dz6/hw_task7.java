package homeworks_dz6;

public class hw_task7 {
    public static void main(String[] args) {
        int num [] = {15, 87, 32, 98, 54, 65, 63, 41, 97, 101};
        double average = 0;
        if (num.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < num.length; j++) {
                sum += num[j];
            }
            average = sum / num.length;
        }
        System.out.println(average);

        for (int j = 0; j < num.length; j++) {
            if (num[j] < average){
                System.out.print(num[j] + " ");
            }
        }


    }
}
