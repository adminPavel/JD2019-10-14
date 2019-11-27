package by.it.komarov.jd01_12;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new LinkedList<>();
        for (int i = 0 ;; i++) {
            if (list.contains("end"))
                break;
            list.add(i, scanner.next());
        }

        System.out.println(list);

        for (;;) {
            if(list.size() != 1)
            round(list);
                break;
        }

//        for (int i = 1; i < list.size(); i++) {
//                list.remove(i);
//            System.out.println(list);
//        }

        System.out.println(list);

    }

    private static List<?> round(List<?> list){
        for (int i = 1; i < list.size(); i++) {
            list.remove(i);
        }
        return list;
    }
}
