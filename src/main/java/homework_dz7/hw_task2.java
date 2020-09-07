package homework_dz7;

public class hw_task2 {
    public static void main(String[] args) {
        String str = "Here you can find activities to practise your reading skills. Reading will help you to improve your understanding of the language and build your vocabulary.";
        String UpperCaseStr = str.toUpperCase();
        System.out.println(UpperCaseStr);

        String LowerCaseStr = str.toLowerCase();
        System.out.println(LowerCaseStr);

        int words = 0;
        for (String word : str.split(" ")){
            words = words + 1;
            String UpperWord = word.substring(0,1).toUpperCase() + word.substring(1);
            System.out.print(UpperWord + " ");
        }
        System.out.println(" ");
        System.out.println("Words count = " + words);
        System.out.println("");
        System.out.println(str.replaceAll("a", "@"));

        int letters = 0;
        for (Character letter : str.toCharArray()) {
            letters = letters +1;
        }
        System.out.println("Character count = " + letters);
    }
}
