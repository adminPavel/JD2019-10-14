package by.it.akhmelev.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {

    private static final String vowels = "уеэоаыяиюёУЕЭОАЫЯИЮЁ";

    public static void main(String[] args) {
        Pattern p = Pattern.compile("[а-яёА-ЯЁ]+");
        Matcher matcher = p.matcher(Poem.text);
        while (matcher.find()) {
            String word = matcher.group();
            if (checkWord(word))
                System.out.println(word);
        }
    }

    private static boolean checkWord(String word) {
        return (vowels.indexOf(word.charAt(0)) < 0) &&
                (vowels.indexOf(word.charAt(word.length() - 1)) >= 0);
    }

}
