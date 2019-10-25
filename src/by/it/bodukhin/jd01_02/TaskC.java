package by.it.bodukhin.jd01_02;


import java.util.Arrays;
import java.util.Scanner;


public class TaskC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][]=step1(n);
        System.out.println(step2(matrix));
        System.out.println(Arrays.deepToString(step3(matrix)));
    }

     static int[][] step1(int n) {
        int mas[][] = new int[n][n];
        boolean min;
        boolean max;
        System.out.println("Исходная матрица");
        do {
            min = false;
            max = false;
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas.length; j++) {
                    int k = (int) Math.round((Math.random() * (2 * n) - n));
                    mas[i][j] = k;
                    if (k == -n) min = true;
                    if (k == n) max = true;
                }
            }
        } while (!min || !max);

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        return mas;
    }

    static int step2(int[][] mas) {
        int result = 0;
        int sum = 0;
        int count = 0;
        System.out.println("Сумма по строкам");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (count == 1 && mas[i][j] < 0 ) {
                    if(j!=mas[i].length-1) {
                        sum = sum + mas[i][j];
                    }
                }
                if (mas[i][j] > 0) {
                    count++;
                }
            }
            result = result + sum;
            System.out.println(sum);
            sum = 0;
            count = 0;;
        }
        System.out.println("Общая сумма всех строк ");
        return result;
    }

     static int[][] step3(int[][]mas) {
        int rows = mas.length;
        int cols = mas.length;
        boolean[] delRow = new boolean[mas.length];
        boolean[] delCol = new boolean[mas.length];
        int max = mas[0][0];
         System.out.println("Матрица без строк и столбцов с максимумом");

         for (int i = 1; i < mas.length; i++) {
             for (int j = 1; j < mas[i].length; j++) {
                 if (mas[i][j] > max) {
                     max = mas[i][j];
                 }
             }
         }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                int k = mas[i][j];
                if(k==max){
                    delRow[i]=true;
                }
            }
        }

         for (int i = 0; i < mas.length; i++) {
             for (int j = 0; j < mas[i].length; j++) {
                 int k = mas[i][j];
                 if(k==max){
                     delCol[j]=true;
                 }
             }
         }

         for(boolean e : delRow) if (e) rows--;
         for(boolean e : delCol) if (e) cols--;
         int[][] result = new int [rows][cols];
         int ir = 0;
         for (int i = 0; i < mas.length; i++) {
             if(!delRow[i]) {
                 int jr = 0;
                 for (int j = 0; j < mas[i].length; j++) {
                     if(!delCol[j]){
                         result[ir][jr++]=mas[i][j];
                     }
                 }
                 ir++;
             }
         }
        return result;
    }
}


