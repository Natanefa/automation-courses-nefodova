package homework_dz7;

public class hw_task2_2 {
    public static void main(String[] args) {
        String str = "Here you can find activities to practise your reading skills. Reading will help you to improve your understanding of the language and build your vocabulary.";
        int letters = 0;
        for (Character letter : str.toCharArray()) {
            letters = letters +1;
        }
        System.out.println("Character count = " + letters);
        System.out.println("");
    }
}
