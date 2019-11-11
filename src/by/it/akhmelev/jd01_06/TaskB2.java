package by.it.akhmelev.jd01_06;

import java.util.Arrays;
import java.util.Comparator;

public class TaskB2 {

    public static void main(String[] args) {
        String[] sentenses = Poem.text.replace("...", "@").split("[.!?]");
        for (int i = 0; i < sentenses.length; i++) {
            sentenses[i] = sentenses[i]
                    .trim()
                    .replaceAll("[^@а-яА-ЯёЁ]+", " ")
                    .replace("@", "...");

        }
        Comparator<String> comparator=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        Arrays.sort(sentenses, comparator);
        for (String sentens : sentenses) {
            System.out.println(sentens);
        }
    }
}
