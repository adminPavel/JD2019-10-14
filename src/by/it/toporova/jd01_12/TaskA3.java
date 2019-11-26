package by.it.toporova.jd01_12;

import java.util.ArrayList;
import java.util.Scanner;

//TaskA3. В main класса TaskA3 вводите список чисел с клавиатуры до ввода слова “end”.
//Переставьте отрицательные элементы списка чисел в конец, а положительные —
// в начало списка, сохраняя их порядок относительно друг друга.
//Выведите список на консоль методом коллекции toString().
public class TaskA3 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();// сюда сохраним результат
        Scanner scanner = new Scanner(System.in);
        int position = 0;
        for(;;){
            String word = scanner.next();
            if (word.equals("end")){
                break;
            }
            Integer integer = Integer.valueOf(word);
            if (integer<0)
                arrayList.add(integer);
            else if (integer==0)
                arrayList.add(position, integer);
            else
                arrayList.add(position++, integer);
        }
        System.out.println(arrayList);

    }

}


