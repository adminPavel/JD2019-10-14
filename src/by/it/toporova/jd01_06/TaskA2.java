package by.it.toporova.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Определить,
// сколько раз повторяется в тексте каждое слово,
// которое встречается в нем, используя массивы.
// Вывести результаты на консоль в формате слово=повторы
public class TaskA2 {
    private static String[] w = new String[0]; //или ={}
    private static int[] counts = {};

    private static void position(String word) {
        for (int i = 0; i < w.length; i++) {
            if (w[i].equals(word)) {
                counts[i]++;
                return;
            }
        }
       w=Arrays.copyOf(w,w.length+1);
        w[w.length-1]=word;
        counts=Arrays.copyOf(counts, counts.length+1);
        counts[counts.length-1]=1;
    }

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[а-яёА-ЯЁ]+"); //паттерн
        Matcher matcher = pattern.matcher(Poem.text);
        while (matcher.find()) {  //находим слова
            String word = matcher.group();
            position(word);
     //       System.out.println("khj "+ word);

        }
        for (int i = 0; i < w.length; i++) {
         System.out.println(w[i] + "=" + counts[i]);
       }
    }
}