package by.it.komarov.jd01_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskA3 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int posZero=0;
        while(true){
            String word = scanner.next();
            if (word.equals("end")){
                break;
            }
            Integer i = Integer.valueOf(word);
            if (i<0)
                numbers.add(i);
            else if (i==0)
                numbers.add(posZero,i);
            else
                numbers.add(posZero++,i);
        }
        System.out.println(numbers);
    }
}
