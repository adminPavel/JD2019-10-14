package by.it.yaroshenko.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskC1 {
    private static String[] array_sentences = new String[0];
    private static int max_length = 0;
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ].+");
        Matcher matcher = pattern.matcher(sb);
        while (matcher.find()) {
            String sentence = matcher.group();
            int last = array_sentences.length; //Последнй элемент
            array_sentences = Arrays.copyOf(array_sentences, last + 1); //копируем массив, увеличиваем его на 1
            array_sentences[last] = sentence; //запомним слово
        }
        max_length = getMax_lengthSentence();
        for (String array_sentence : array_sentences) {
            changeRow(array_sentence);
        }
    }
    private static int getMax_lengthSentence() {
        for (String array_sentence : array_sentences) {
            if (array_sentence.length() > max_length) {
                max_length = array_sentence.length();
            }
        }
        return max_length;
    }
    private static void changeRow(String sentence) {
        if (sentence.length() == max_length) {
            System.out.println(sentence);
        }
        StringBuilder stringBuilder = new StringBuilder(sentence);
        int count=-1;
        while (stringBuilder.length() < max_length) {
            count++;
            for (int i = 0; i < stringBuilder.length(); i++) {
                if (stringBuilder.length() < max_length) {
                    if (stringBuilder.charAt(i) == ' ') {
                        stringBuilder.insert(i, " ");
                        i += (2+count);
                    }
                }
                if (stringBuilder.length() == max_length) {
                    System.out.println(stringBuilder);
                    break;
                }
            }
        }
    }
}
