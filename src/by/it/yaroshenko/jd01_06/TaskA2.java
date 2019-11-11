package by.it.yaroshenko.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {
    private static String[] w=new String[0];
    private static int[] count=new int[0];

    /**
     *Метод возвращает позицию i слова в массиве w, если такого слова нету, возвращает -1
     */
    private static int position(String word) {
        for (int i = 0; i < w.length; i++) {
            if(w[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яA-ЯёЁ]+");
        Matcher matcher = pattern.matcher(sb);
        while (matcher.find()) {
            String word = matcher.group();
            int p = position(word);
            if (p>=0) {
                count[p]++;
            } else {
                int last=w.length; //Последнй элемент
                w= Arrays.copyOf(w, last+1); //копируем массив, увеличиваем его на 1
                w[last]=word; //запомним слово
                count=Arrays.copyOf(count,last+1);
                count[last]=1; //укажем частоту повторений =1
            }
        }
        for (int i = 0; i < w.length; i++) {
            System.out.println(w[i]+"="+count[i]);
        }
    }
}
