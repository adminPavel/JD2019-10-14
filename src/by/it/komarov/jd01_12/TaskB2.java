package by.it.komarov.jd01_12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[100];

        for (int i = 0; i < words.length; i++) {
            words[i] = scanner.next();
            if (words[i].equals("end"))
                break;
        }


        List<String> list = new LinkedList<>(Arrays.asList(words));

        System.out.println(list);

        for (int i = 1; i < list.size(); i++) {
            while (list.size() != 1)
                list.remove(i);
            break;
        }
        System.out.println(list);






    }


}
