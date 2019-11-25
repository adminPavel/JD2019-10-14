package by.it.yaroshenko.jd01_07;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String text = "{ { 1.0, 2.0, 7.0 }, { 3.0, 4.0, 7.0 }, { 5.0, 6.0, 7.0 } }";
                int count=0;
        String[] str_array = text.split("},");
        String[] w=new String[0];
        StringBuilder sb = new StringBuilder(Arrays.toString(str_array));
        Pattern pattern = Pattern.compile("[\\d.\\d]+");
        Matcher matcher= pattern.matcher(sb);
        while (matcher.find()) {
            count++;
            int last=w.length; //Последнй элемент
            w= Arrays.copyOf(w, last+1); //копируем массив, увеличиваем его на 1
            w[last]=matcher.group(); //запомним слово

        }
        System.out.println(count);
        for (int i = 0; i < w.length; i++) {
            System.out.println(w[i]);
        }
    }
}
