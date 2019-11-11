package by.it.yaroshenko.jd01_02;

import java.util.Arrays;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int [][] array = step1(n);
       for (int[] row:array) {
           System.out.println(Arrays.toString(row));
       }


        step1(n);
        //int[][] mas = new int[n][n];
        //step2(mas);

    }
/*
    private static int[][] step1(int n) {
        int[][] array = new int[n][n];
        int a = 0, b = 0;
        int i,j;
            do {
                a = 0; // обнуляются значения переменных
                b=0;   // обнуляются значения переменных
                 for (i = 0; i < array.length; i++) {
                    for (j = 0; j < array[i].length; j++) {
                        int random_number = -n + (int) (Math.random() * ((n+n)+1));
                        array[i][j] = random_number;
                        if (array[i][j] == n) { a++; } //если есть в массиве n то записываем его значение в переменную а
                        if (array[i][j] == -n){ b++; } //если есть в массиве n то записываем его значение в переменную b
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.print('\n');
                }
                System.out.println('\n');
               // System.out.println("a = "+a +", " + "b = " + b);
            } while ((a <= 0) | (b <=0)); // покуда в массиве не будет значения n и -n цикл будет повторяться


        return array;
    }
*/
    private static int[][] step1(int n) {
        int[][] array = new int[n][n];
        boolean maxOk;
        boolean minOk;
        do {
            maxOk=false;
            minOk=false;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = -n + (int) (Math.random() * (2 * n + 1));
                    if (array[i][j] == n) maxOk = true;
                    if (array[i][j] == -n) minOk = true;
                }
            }
        } while ((!maxOk) || (!minOk));
        return array;
        }
    }


//    private static int step2(int[][] mas) {
//                for (int i = 0; i < mas.length; i++) {
//                    for (int j = 0; j < mas[i].length; j++) {
//                int random_number = -100 + (int) (Math.random() * (201));
//                mas[i][j] = random_number;
//
//                System.out.print(mas[i][j] + " ");
//            }
//            System.out.print('\n');
//        }
//        System.out.println('\n');
//
//        return 0;
//    }


