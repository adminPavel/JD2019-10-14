package by.it.konovalova.jd01_04;

import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] name = new String[n];
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.next();
        }

        int[][] zp = new int[n][4];
        for (int i = 0; i < name.length; i++) {
            System.out.println("Введите зарплату для " + name[i]);
            for (int j = 0; j < 4; j++) {
                zp[i][j] = sc.nextInt();
            }
        }

        int[] itog = new int[n];
        for (int i = 0; i < itog.length; i++) {
            itog[i] = 0;
            for (int i1 = 0; i1 < zp[0].length; i1++) {
                itog[i] = (itog[i] + zp[i][i1]);
            }
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Фамилия   " + "Квартал1  " + "Квартал2  " + "Квартал3  " + "Квартал4  " + "Итого");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < name.length; i++) {
            System.out.printf("%7s:  %-10d%-10d%-10d%-10d%-5d", name[i], zp[i][0], zp[i][1], zp[i][2], zp[i][3], itog[i]);
            System.out.println();
        }
        System.out.println("-------------------------------------------------------");

        int sum=0;
        for (int i = 0; i < itog.length; i++) {
            sum=sum+itog[i];
        }
        System.out.println("Итого     "+sum);

        double sum1=(double) sum/n/4;
        System.out.printf("%-10s%.4f", "Средняя", sum1);
    }
}

