package by.it.komarov.jd01_02;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] mas = new int[n][n];

        step1(n);
        step2(mas);

    }

    public static int[][] step1(int n) {
        int [][] mas = new int[n][n];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = (int) (Math.random() * 10) - 5;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[i][j] + " " );
            }
            System.out.print("\n");
        }
        return mas;

    }

    public static int step2(int[ ][ ] mas){
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                sum += mas[i][j];
            }
        }
        System.out.println(sum);
        return sum;

        }
    }


