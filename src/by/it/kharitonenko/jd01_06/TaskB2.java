package by.it.kharitonenko.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {
    //паттерн = начинается с большой буквы, заканчивается точкой [А-ЯЁ]\\.
    //([А-ЯЁ]){1}[^\.]+(\.{1}) ???
    //затем отформатировать на пробелы и убрать их

    public static void main(String[] args) {
        int counter = 0;

        Pattern pattern = Pattern.compile("([А-ЯЁ]){1}[^\\.]+(\\.{1})");
        Matcher matcher = pattern.matcher(Poem.text.replace("...",""));

        while (matcher.find()) {
            System.out.printf(matcher.group() + "\n***");
            counter++;
        }

        String[] sentences = new String[counter];
        matcher.reset();

        for (int i = 0; i <= sentences.length-1; i++) {
            matcher.find();
            sentences[i] = matcher.group().replaceAll("\\p{Punct}"," ");
            sentences[i] = sentences[i].replaceAll("\\n"," ");
            sentences[i] = sentences[i].replaceAll("\\p{Blank}{2,}"," ");
            sentences[i] = sentences[i].trim();
        }
        boolean done;
        String temp;
        do {
            done = true;
            for (int i = 0; i < sentences.length-1; i++) {
                if (sentences[i].length() > sentences[i + 1].length()) {
                    temp = sentences[i];
                    sentences[i] = sentences[i + 1];
                    sentences[i + 1] = temp;
                    done = false;
                }
            }
        } while (!done);
        for (String sentence : sentences) {
            System.out.printf(sentence + "\n");
        }
    }
}
