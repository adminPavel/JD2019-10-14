package by.it.sermyazhko.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {
    private static String[] words = new String[0];
    private static int[] counts = new int[0];

    public static void main(String[] args) {
        String regex = "[а-яёА-ЯЁ]+";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(Poem.text);
        while(m1.find()) {
            String word = m1.group();
            search(word);
        }
        printResult(words,counts);
    }

    private static void printResult(String[] words, int[] counts) {
        for (int i = 0; i < words.length; i++) {
            System.out.printf("%s=%d\n",words[i], counts[i]);
        }
    }

    private static void search(String word) {
        for (int i = 0; i < words.length; i++) {
            if(word.equals(words[i])){
                counts[i]++;
                return;
            }
        }
        words = Arrays.copyOf(words,words.length + 1);
        words[words.length-1] = word;
        counts = Arrays.copyOf(counts,counts.length + 1);
        counts[counts.length - 1] = 1;
    }

}
