package by.it.baranovskaya.jd01_04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        int[][] salary = new int[4][n];
        //System.out.println("Введите зарплату для " + arr);
        for (int i = 0; i < salary.length; i++) {
            for (int j = 0; j < salary.length ; j++) {
                System.out.println(salary[i][j]);
            }

        }
    }
}
