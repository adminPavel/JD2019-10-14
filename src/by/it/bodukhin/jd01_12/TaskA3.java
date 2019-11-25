package by.it.bodukhin.jd01_12;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int posZero =0;
        for(;;) {
            String word = scanner.next();
            if(word.equals("end")){
                break;
            }
            Integer i = Integer.valueOf(word);
            if(i>0){
                num.add(posZero++, i);
            }
            else if(i<0){
                num.add(i);
            }else {
                num.add(posZero,i);
            }
        }
        System.out.println(num);
    }
}
