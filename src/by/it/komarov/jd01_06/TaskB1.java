package by.it.komarov.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    private static final String vowels = "уеэоаыяиюёУЕЭОАЫЯИЮЁ";

    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("\\b[цкнгшщзхфвпрлджчсмтбЦКНГШЩЗХФВПРЛДЖЧСМТБ]+[а-яА-ЯёЁ]*[йуеъыаоэяиюьё]+\\b");
        Matcher matcher = pattern.matcher(Poem.text);

        while (matcher.find()){
            String words = matcher.group();
            if (checkWord(words))
            System.out.println(words);
        }
    }

    private static boolean checkWord(String word) {
        return (vowels.indexOf(word.charAt(0)) < 0) && (vowels.indexOf(word.charAt(word.length() - 1)) >= 0);
    }
}
