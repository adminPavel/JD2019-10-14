package by.it.sermyazhko.jd01_02;

import java.util.Arrays;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][]mas = step1(n);
        int sum = step2(mas);
        int[][]mas1 = step3(mas);

    }

    private static int[][] step3(int[ ][ ] mas) {

        int i_max = 0;
        int j_max = 0;
        int max = 0;
        //search max
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (max < mas[i][j]) {
                    max = mas[i][j];
                    i_max = i;
                    j_max = j;
                }
            }
        }

        //находим кол-во max элементов
        int count = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (max == mas[i][j]) {
                    count += 1;
                }
            }
        }
        //System.out.println("count= " + count);

        System.out.println("i_max = " + i_max);
        System.out.println("j_max = " + j_max);

        int mas1[][] = new int[mas.length - 1][mas.length];
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 0; j < mas.length; j++) {

                if (i >= i_max) {
                    mas1[i][j] = mas[i + 1][j];
                }
                if (i < i_max) {
                    mas1[i][j] = mas[i][j];
                }
                System.out.print(mas1[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");


        int mas2[][] = new int[mas.length - 1][mas.length - 1];
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 0; j < mas.length - 1; j++) {
                if (j >= j_max) {
                    mas2[i][j] = mas1[i][j + 1];
                }
                if (j < j_max) {
                    mas2[i][j] = mas1[i][j];
                }
                System.out.print(mas2[i][j] + " ");
            }
            System.out.print("\n");
        }
        return mas2;
    }

    private static int step2(int[][] mas) {
        int sum = 0;
        //int i1;
        //int j1;
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            count = 0;
            for (int j = 0; j < mas.length; j++) {
                if(mas[i][j] > 0 & count == 0){
                    count = 1;
                    continue;
                }
                if(count == 1 & mas[i][j] <= 0){
                    sum += mas[i][j];
                    continue;
                }
                if(mas[i][j] > 0 & count == 1){
                    count = 2;
                    break;
                }
            }
        }
        return sum;
    }

    private static int[][] step1(int n){
        boolean is_n = false;
        boolean is_min_n = false;
        int mas[][] = new int[n][n] ;
        while (true) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mas[i][j] = rand(-n, n);
                    if (mas[i][j] == n){
                        is_n = true;
                    }
                    if (mas[i][j] == -n){
                        is_min_n = true;
                    }
                }
            }
            if(is_n == true & is_min_n == true){
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(mas[i][j] + " ");
                    }
                    System.out.println("\n");
                }
                break;
            }
        }
        return  mas;
    }

    private static int rand(int min, int max) {
        int elem = (int)(Math.random()*((max-min)+1)) + min ;
        return elem;
    }
}
