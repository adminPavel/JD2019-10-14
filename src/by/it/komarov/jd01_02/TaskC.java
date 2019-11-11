package by.it.komarov.jd01_02;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] mas = step1(n);

        printArr(mas);
    }

    private static int[][] step1(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = -n + (int) (Math.random() * (2 * n + 1));
            }
        }
        return array;
    }

    private static void printArr(int[][] mas){
        for (int[] ma : mas) {
            for (int j = 0; j < mas.length; j++) {
                System.out.printf("%d ", ma[j]);
            }
            System.out.println();
        }
    }
}
