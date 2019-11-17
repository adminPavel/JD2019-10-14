package by.it.sermyazhko.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        String regex = "[а-яёА-ЯЁ]{4,}";
        StringBuilder sb = new StringBuilder(Poem.text);
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(sb);
        while(m1.find())
        {
            String word = m1.group();
            if(word.length() >= 7){
                sb.setCharAt(m1.start()+6,'#');
            }
            sb.setCharAt(m1.start()+3,'#');
        }
        System.out.println(sb);
    }
}
