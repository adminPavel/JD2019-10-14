package by.it.toporova.jd01_06;


//1.TaskB1.Вывести в консоль все слова текста, начинающихся согласной и
// заканчивающихся гласной буквой
// (нужно сделать для проверки этого условия приватный метод без regex).


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    private static String[] wordsArr = new String[0]; //массив слов
    private static char[] vowelsArr = {'а', 'е', 'ё', 'э', 'ы', 'у', 'о', 'и', 'ю', 'я'}; //массив гласных

    public static void main(String[] args) {
        Pattern p = Pattern.compile("[а-яёА-ЯЁ]+");//паттерн для отбора только слов (исключая знаки препинания и пр.)
        Matcher matcher = p.matcher(Poem.text);
        while (matcher.find()) {
            String word = matcher.group();
            process(word); //вызов метода для разбора текста в массив строк
        }
        findWord(wordsArr);
    }

    private static void process(String word) {
        wordsArr = Arrays.copyOf(wordsArr, wordsArr.length+1);
        wordsArr [wordsArr.length-1] = word;
    }

//метод для перебора букв из метода слов
    private static boolean isVowels(char c) {
        c = Character.toLowerCase(c);
        for (char v : vowelsArr) {
            if (c == v) {
                return true;
            }
        }
        return false;
    }

//в метод передается массив слов и перебираются жлементы массива от первого символа до последнего.
// Первый символ должен не попадать в список гласных, а последний - попадать. В рамках метода вызов isVowels для сравнения символа с чаром гласных
    private static void findWord(String[] words) {
        for (String word : words) {
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            if (!isVowels(first)) {
                if (isVowels(last)) {
                    System.out.println(word);
                }
            }
        }


    }

}