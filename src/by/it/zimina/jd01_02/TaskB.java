package by.it.zimina.jd01_02;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        step1();
  //      step2();
  //      step3();
    }

    static void step1() {

        int[] mas= new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        for (int i = 0; i<mas.length; i++) {
            if(i!=0 & i % 5 == 0) System.out.println();
            System.out.print(mas[i]+" ");


        }


    }

/*    static void step2() {

    }

    static void step3() {

    }
    */

}