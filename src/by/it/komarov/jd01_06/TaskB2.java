package by.it.komarov.jd01_06;

import java.util.Arrays;
import java.util.Comparator;

public class TaskB2 {
    public static void main(String[] args) {

            String[] sentenses = Poem.text.replace("...", "@").split("[.!?]");
            for (int i = 0; i < sentenses.length; i++) {
                sentenses[i] = sentenses[i]
                        .trim() // удаление пробелов по краям
                        .replaceAll("[^@а-яА-ЯёЁ]+", " ") // заменение всех эл-ов на " ", кроме Regex
                        .replace("@", "..."); // Замена @ на ...
            }
//            Comparator<String> comparator = new Comparator<String>() {  1 способ
//                @Override
//                public int compare(String str1, String str2) {
//                    return str1.length()-str2.length();
//                }
//            };

//        Comparator<String> comparator = (str1, str2) -> str1.length() - str2.length();  2 способ
//        Comparator<String> comparator = Comparator.comparingInt(String::length); 3 способ

            Arrays.sort(sentenses, Comparator.comparingInt(String::length)); // Inline

            for (String sentens : sentenses) {
                System.out.print(sentens);
            }
        }
}
