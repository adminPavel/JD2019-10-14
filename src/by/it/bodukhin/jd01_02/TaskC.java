package by.it.bodukhin.jd01_02;



import java.util.Scanner;


public class TaskC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mas[][] = new int[n][n];
        step1(n);
    }

     static int[][] step1(int n) {
        int mas[][] = new int[n][n];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                int k = (int) Math.round((Math.random() * (2 * n) - n));
                mas[i][j] = k;
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        return mas;
    }
}


