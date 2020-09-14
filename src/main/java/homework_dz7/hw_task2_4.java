package homework_dz7;

public class hw_task2_4 {
    public static void main(String[] args) {
        char [] Text = {'h', 'e', 'l', 'p'};
        System.out.println(String.copyValueOf(Text, 0, 4));
        System.out.println(String.copyValueOf(Text, 1, 3) + String.copyValueOf(Text, 0, 1));
        System.out.println(String.copyValueOf(Text, 2, 2) + String.copyValueOf(Text, 0, 2));
        System.out.println(String.copyValueOf(Text, 3, 1) + String.copyValueOf(Text, 0, 3));
    }
}
