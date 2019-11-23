package by.it.toporova.jd01_12;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static jdk.nashorn.internal.objects.Global.print;

//TaskB1.Нужно ввести с консоли текст на английском языке до строки “end”
// (100 и более слов).
//Для каждого слова с помощью коллекций подсчитать частоту его встречаемости.
//Вывести все различныеслова формате слово=частота.Слова, отличающиеся регистром
// букв, считать различными. isn't или don’t –одно слово.
public class TaskB1 {

    private static Map<String, Integer> words = new HashMap<>(200);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String text;
        do {
            text = scanner.nextLine();
            sb.append(text).append(' ');
        } while (!text.equals("end"));
        Pattern pattern = Pattern.compile("[a-zA-Z']+");
        Matcher matcher = pattern.matcher(sb);
        while (matcher.find()) {
            String word = matcher.group();
            process(word);
        }
        print(words);
    }
    private static void print(Map<String, Integer> words) {
        Set<Map.Entry<String, Integer>> entries = words.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    private static void process(String word) {
        int code = word.hashCode();// получение хэш кода слова

        Set<Map.Entry<String, Integer>> entries = words.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getKey().hashCode() == code) { //счетчик слов
                Integer count = entry.getValue();
                count++;
                entry.setValue(count);
                return;
            }
        }
        words.put(word, 1);


    }


}
