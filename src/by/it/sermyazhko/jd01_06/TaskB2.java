package by.it.sermyazhko.jd01_06;

public class TaskB2 {

    static String[] sentences;
    public static void main(String[] args) {
        String poem = Poem.text.replaceAll("[^а-яА-ЯёЁ.!]+", " ");
        poem = poem.replaceAll("[.]{2,}", "");
        sentences = poem.split("[.!]");
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].trim();
        }
        sort(sentences);
        for (String s : sentences) {
            System.out.println(s);
        }
    }

    static void sort(String[] arr) {
        int count = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < count; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            count--;
        }
    }
}


