package by.it.yaroshenko.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
        public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(Poem.text);
        Pattern pattern=Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher = pattern.matcher(sb);
        while (matcher.find()) {
            String word = matcher.group();
            if(word.length()>1) {
                String first_letter = word.substring(0, 1);
                String last_letter = word.substring(word.length() - 1);
                getWordWithStartConsonantEndVowel(word, first_letter, last_letter);
            }
        }
    }
    private static void getWordWithStartConsonantEndVowel(String word, String first_letter, String last_letter) {
        String[] consonant = {"б", "в", "г", "д", "ж", "з", "й", "к", "л", "м", "н", "п", "р", "с", "т", "ф", "х", "ц", "ч", "ш", "щ"};
        String[] vowel = {"а", "у", "о", "ы", "и", "э", "я", "ю", "ё", "е"};
        for (String s : consonant) {
            if (s.equalsIgnoreCase(first_letter)) {
                for (String value : vowel) {
                    if (value.equalsIgnoreCase(last_letter)) {
                        System.out.println(word);
                    }
                }
            }
        }
    }
}
