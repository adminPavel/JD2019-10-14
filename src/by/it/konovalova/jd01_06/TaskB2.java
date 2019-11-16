package by.it.konovalova.jd01_06;

import java.util.Arrays;
import java.util.Comparator;

public class TaskB2 {
    public static String[] sortStrArray(String[] array) {
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Integer.compare(a.length(), b.length());
            }
        });
        return array;
    }

    public static void main(String[] args) {
        String words = Poem.text;
        words = words.replaceAll("\\n", " ");
        words = words.replaceAll(",", "");
        words = words.replaceAll("!", "\\.");
        words = words.replaceAll(" - ", " ");
        words = words.replaceAll(":", "");
        words = words.replaceAll("\\.\\.\\.", "");
        String[] arr = words.split("\\.");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].trim();
        }

        Arrays.toString(sortStrArray(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
