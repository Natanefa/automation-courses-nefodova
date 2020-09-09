package homework_dz7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        System.out.println("");

//        Pattern pattern = new Pattern("\\d+");
//        String code = "AX6BYU56UX6CV6BNT7NM";
//        Matcher matcher = pattern.matcher(code);
//        int start = 0;
//        while (matcher.find(start)) {
//            String numbers = code.substring(matcher.start(), matcher.end());
//            int res = Integer.parseInt(numbers);
//            System.out.println(res);
//            start = matcher.end();
//        }
        Pattern pat=Pattern.compile("(\\d)\\D*(\\d)");
        Matcher matcher=pat.matcher("AX6BYU56UX6CV6BNT7NM");
        int digits = 1;
        while (matcher.find()) {
            System.out.println("numbers code: " + matcher.group(1) + matcher.group(2));
            digits = digits * Integer.parseInt(matcher.group(1) + matcher.group(2));
        };
        System.out.println("AX6BYU56UX6CV6BNT7NM" + " " + digits);
        System.out.println("");


        char [] Text = {'h', 'e', 'l', 'p'};
        System.out.println(String.copyValueOf(Text, 0, 4));
        System.out.println(String.copyValueOf(Text, 1, 3) + String.copyValueOf(Text, 0, 1));
        System.out.println(String.copyValueOf(Text, 2, 2) + String.copyValueOf(Text, 0, 2));
        System.out.println(String.copyValueOf(Text, 3, 1) + String.copyValueOf(Text, 0, 3));
    }
}
