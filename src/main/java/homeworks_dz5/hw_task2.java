package homeworks_dz5;
public class hw_task2 {
    public static void main(String[] args) {
        int month = 11;
        if (month > 12 || month < 1) {
            System.out.println("Enter a valid month value");
        }
        else if(month == 12) {
            System.out.println("It is Winter");}
        else if(month >= 9) {
            System.out.println("It is Autumn");}
        else if(month >= 6) {
            System.out.println("It is Summer");}
        else if (month >= 3) {
            System.out.println("It is Spring");}
        else System.out.println("It is Winter");

    }
}






