package by.it.yaroshenko.jd01_06;

import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Текст выводиться одинаковый в двух случаях, но тест не проходит почему-то, время разное в первом случае со String - это ~2.5сек, со StringBuilder - 0.067сек
public class TaskC2 {
    private static String[] array={};//массив слов из Poem
    private static String[] random_words={};//массив рандомных 30000 слов

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яA-ЯёЁ]+");
        Matcher matcher = pattern.matcher(sb);
        while (matcher.find()) {
            String word = matcher.group();
            pushArray(word);
        }
        long timestart=System.currentTimeMillis();
        System.out.println(slow(""));
        long timesend=System.currentTimeMillis();
        System.out.println(timesend-timestart);

        long timestart_fast=System.currentTimeMillis();
        for (String random_word : random_words) {
            System.out.print(fast(random_word + " "));
        }
        System.out.println();
        long timesend_fast=System.currentTimeMillis();
        System.out.println(timesend_fast-timestart_fast);
    }
    /**
     * Метод заполняет массив array словами из Poem.text
     */
    private static String pushArray(String word) {
        int last=array.length; //Последнй элемент
        array= Arrays.copyOf(array, last+1); //копируем массив, увеличиваем его на 1
        array[last]=word; //запомним слово
        return word;
    }
    /**
     *Метод формирует String из случайных слов размером более 100тыс символов
     */
    private static String slow(String text) {
        int count=0;
        while(count<30000) {
            String a = randomWord(array);
            text += a + " ";
            count++;
            //pushArray(a);
            int last=random_words.length; //Последнй элемент
            random_words= Arrays.copyOf(random_words, last+1); //копируем массив, увеличиваем его на 1
            random_words[last]=a; //запомним слово
        }
           return text;
    }
    /**
     * Метод возвращает слово из массива случайныйм образом
     */
    private static String randomWord(String[] array){
        int random = new Random().nextInt(array.length);
        return array[random];
    }

   private static String fast(String text) {
       StringBuilder sb = new StringBuilder(text);
       sb.append(sb);
       return text;
   }
}
