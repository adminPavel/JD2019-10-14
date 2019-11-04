package by.it.kazak.jd01_04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] s = new String[size];
        for (int i = 0; i < size; i++) {
            s[i] = sc.nextLine();
        }
        int q = 4;
        String[][] mas = new String[size][q];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = sc.nextLine();
                System.out.println(mas[i][j]);
            }
        }
    }
}
