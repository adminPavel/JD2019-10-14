package by.it.toporova.jd01_02;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] mas=new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }
        step1(mas);
        step2(mas);
        step3(mas);

    }

    private static void step1(int[] mas) {
         int min=mas[0];
         int max=mas[0];
        for (int element = 1; element < mas.length; element++) {
            if (mas[element]<min) {
                min=mas[element];
            }
            if (mas[element]>max) {
                max=mas[element];
            }
        }
        System.out.println(min + " " + max);
    }

   private static void step2 (int[] mas) {
       double avg = 0;

       for (int i : mas) {    //было до замены на forache for (int element = 0; element < mas.length; element++) {
           avg = i + avg;
           avg = i + avg;

       }

       avg = avg/mas.length;

       for (int ma : mas) {
           if (ma < avg) {
               System.out.print(ma + " ");
           }
       }

    }

    private static void step3(int[] mas) {
        int min=mas[0];
        for (int element = 1; element < mas.length; element++) {
            if (mas[element]<min) {
                min=mas[element];

            }
        }

        for (int i = mas.length - 1; i >= 0; i--) {
            if (mas[i]==min){
                System.out.print(i + " ");

            }
        }
    }


}
