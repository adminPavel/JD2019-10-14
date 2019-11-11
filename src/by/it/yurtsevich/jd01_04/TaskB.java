package by.it.yurtsevich.jd01_04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        System.out.println("Введите фамилии сотрудников");
        String[] surname = new String[numb];
        for (int i = 0; i < numb; i++) {
            surname[i] = sc.next();


        }

        int[][] sal = new int[numb][4];
        int[] emptotal = new int[surname.length];
        int total = 0;
        for (int i = 0; i < surname.length; i++) {
            System.out.println("Введите зарплату для " + surname.length);
            for (int j = 0; j < 4; j++) {
                sal[i][j] = sc.nextInt();
                emptotal[i] = emptotal[i] + sal[i][j];
            }
            total = total + emptotal[i];
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%n", "Фамилия", "Квартал1", "Квартал2",
                "Квартал3", "Квартал4", "Итого");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < surname.length; i++) {
            System.out.printf("%-10s%-10d%-10d%-10d%-10d%-10d%n", surname[i] + ":", sal[i][0], sal[i][1],
                    sal[i][2], sal[i][3], emptotal[i]);
        }
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-10s%-10d%n", "Итого", total);
        System.out.printf("%-10s%-10.4f%n", "Средняя", ((double) total / (numb * 4)));
    }
}
