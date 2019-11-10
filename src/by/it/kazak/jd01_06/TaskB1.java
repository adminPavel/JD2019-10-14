package by.it.kazak.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    private static String[] words = new String[0];
    private static char[] sm = {'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'};

    public static void main(String[] args) {
        Pattern pt = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher = pt.matcher(Poem.text);
        while (matcher.find()) {
            String word = matcher.group();
            search(word);
        }
        findWord(words);
    }

    private static void search(String word) {
        words = Arrays.copyOf(words, words.length + 1);
        words[words.length - 1] = word;
    }
    private static boolean sm(char c){
        c= Character.toLowerCase(c);
        for(char d : sm) {
            if(c == d) {
                return true;
            }
        }
        return false;
    }

    private static void findWord(String[] words){
        for (String word : words) {
            char f = word.charAt(0);
            char l = word.charAt(word.length() - 1);
            if (!sm(f)) {
                if (sm(l)) {
                    System.out.println(word);
                }
            }
        }
    }
}
