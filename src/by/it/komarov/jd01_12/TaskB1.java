package by.it.komarov.jd01_12;


//TaskB1. Нужно ввести с консоли текст на английском языке до строки “end” (100 и
//        более слов).
//         Для каждого слова с помощью коллекций подсчитать частоту его встречаемости.
//         Вывести все различные слова формате слово=частота. Слова, отличающиеся
//        регистром букв, считать различными. isn't или don’t – одно слово.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

class TaskB1 {

    public static void main(String[] args) {
        Map<String, Integer> wordBank = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = compile("[\\w^']");

        for (; ; ) {
            String newWord = scanner.next();
            if (newWord.equals("end")) break;
            newWord = newWord.replaceAll("'{1}", "RRRRR")
                    .replaceAll("[\\W]", "")
                    .replaceAll("RRRRR", "'")
                    .trim();
            if (!wordBank.containsKey(newWord)) {
                wordBank.put(newWord, 1);
            } else
                wordBank.replace(newWord, wordBank.get(newWord) + 1);
        }
        System.out.println(wordBank);
    }
}
