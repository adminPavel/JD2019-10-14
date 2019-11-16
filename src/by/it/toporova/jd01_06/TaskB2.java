package by.it.toporova.jd01_06;

import java.util.Arrays;
import java.util.regex.Pattern;

public class TaskB2 {
    //Вывести через \n все предложения текста в порядке возрастания количества
    // символов (!) в каждом из них. В предложениях нужно сначала заменить все
    // небуквенные символы и их последовательности на один пробел и выполнить trim()
    // для каждого предложения.


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String[] sentences = Poem.text.replace("...", "@").split("[.?!]");
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].
                    trim().replaceAll("[^@а-яёА-ЯЁ]+", " ").
                    replace("@", "");
    }
        /*for (int i = 0; i < sentences.length; i++) {
            System.out.println(sentences[i] + " ");
        }*/
      compareSentences(sentences);

    }


    private static void compareSentences(String[] sentences) { //сортировка пузырьком
       boolean isSorted = false;
        String temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < sentences.length - 1; i++) {
                if (sentences[i].length() > sentences[i + 1].length()) {
                    isSorted = false;
                    temp = sentences[i];
                    sentences[i] = sentences[i + 1];
                    sentences[i + 1] = temp;
                }
            }
        }
        for (String sentence : sentences) {
            System.out.println(sentence);
        }




    }
}




