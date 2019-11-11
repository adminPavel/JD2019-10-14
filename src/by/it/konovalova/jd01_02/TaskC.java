package by.it.konovalova.jd01_02;

import java.util.Arrays;
import java.util.Scanner;

public class TaskC {
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mas[][] = new int[n][n];
        mas = step1(n);
        //step2();
        //step3();
        //System.out.println(Arrays.deepToString(mas));

    }

    private static int[][] step1(int n) {
        int mas[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = (int) (Math.random() * (-n - n)) + n;
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mas[i][j] + " ");
                if (mas[i][j] == n || mas[i][j] == (-n)) {
                    break;
                }
            }
            System.out.println();
        }
        return mas;
    }*/

    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mas = step1(n);

    }

    public static int[][] step1(int n) {

        int[][] mas = new int[n][n];
        int min = -n;
        int max = n;
        boolean maxIn = false;
        boolean minIn = false;

        while (!(maxIn == true && minIn == true)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mas[i][j] = rnd(min, max);
                    if (mas[i][j] == min) {
                        minIn = true;
                    }
                    if (mas[i][j] == max) {
                        maxIn = true;
                    }
                }
            }
        }


        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        return mas;
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}


