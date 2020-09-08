package homework_dz7;

public class hw_task2 {
    public static void main(String[] args) {
        String str = "Here you can find activities to practise your reading skills. Reading will help you to improve your understanding of the language and build your vocabulary.";
        String UpperCaseStr = str.toUpperCase();
        System.out.println(UpperCaseStr);

        String LowerCaseStr = str.toLowerCase();
        System.out.println(LowerCaseStr);

        int words = 0;
        int maxLength = 0;
        for (String word : str.split(" ")){
            if (word.length() > maxLength){
                maxLength = word.length();
            }
            words = words + 1;
            String UpperWord = word.substring(0,1).toUpperCase() + word.substring(1);
            System.out.print(UpperWord + " ");
        }
        System.out.println(" ");
        for (int i = 1; i < maxLength; i++) {
            int wordCount = 0;
            for (String word : str.split(" ")){
                if (word.length() == i) {
                    wordCount = wordCount +1;
                }
            }
            if(wordCount > 0) {
                System.out.println(i + " " + wordCount);
            }
        }

        System.out.println(" ");
        System.out.println("max = " + maxLength);
        System.out.println("Words count = " + words);
        System.out.println("");
        System.out.println(str.replaceAll("a", "@"));
        System.out.println(str.replaceAll("c", " "));

        int letters = 0;
        for (Character letter : str.toCharArray()) {
            letters = letters +1;
        }
        System.out.println("Character count = " + letters);

        char [] Text = {'h', 'e', 'l', 'p'};
        System.out.println(String.copyValueOf(Text, 0, 4));
        System.out.println(String.copyValueOf(Text, 1, 3) + String.copyValueOf(Text, 0, 1));
        System.out.println(String.copyValueOf(Text, 2, 2) + String.copyValueOf(Text, 0, 2));
        System.out.println(String.copyValueOf(Text, 3, 1) + String.copyValueOf(Text, 0, 3));
    }
}
