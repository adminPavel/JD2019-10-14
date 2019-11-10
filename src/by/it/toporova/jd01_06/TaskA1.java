package by.it.toporova.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//В каждом слове текста 4-ю и 7-ю буквы заменить символом #.
// Для слов короче 4 символов корректировку не выполнять.
// Для слов короче 7 символов заменять только 4-ю букву.
public class TaskA1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(Poem.text); //текст теперь лежит в динамической строке
        Pattern p = Pattern.compile("[а-яёА-ЯЁ]{4,}"); //паттерн
        Matcher matcher = p.matcher(sb);
        while (matcher.find()){  //находим слова
            String word = matcher.group();
            System.out.println(word + " " + matcher.start());
            sb.setCharAt(matcher.start()+3, '#');
            if (matcher.end()-matcher.start()>6){
                sb.setCharAt(matcher.start() + 6,'#');
            }
        }
        System.out.println(sb);
    }

}
