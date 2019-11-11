package by.it.baranovskaya.jd01_02;

import java.util.Random;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int mas[][] = new int[n][n];
        if (n < 1 || n < 1) {
            System.out.print("Введите размер массива ");
            n = sc.nextInt();
            if (n < 2) {
                System.out.print("Недостаточный размер массива");
                n = sc.nextInt();
            } else {
                Random rnd = new Random();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        mas[n][n] = rnd.nextInt((n + n + 1) - n);
                       /* System.out.println("Матрица:");
                        for (i = 0; i < n; ++i, System.out.println()) {
                            for (j = 0; j < n; ++j) {*/
                                System.out.print(mas[i][j] + " ");
                            }
                        }
                    }
                }
            }
        }
  //  }
//}

