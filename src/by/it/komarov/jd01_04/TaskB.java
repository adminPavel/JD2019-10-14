package by.it.komarov.jd01_04;

import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String sername;
        String[] hash = new String[n];
        for (int i = 0; i < n; i++) {
            sername = scanner.next();
            hash[i] = sername;
        }

        int kvartal = 4;
        int[][] array = new int[n][kvartal];

        int j;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите зарплату для " + hash[i]);
            for (j = 0; j < kvartal; j++) {
                array[i][j] = scanner.nextInt();
                }
            }

        System.out.format("-----------------------------------------------------------------\n");
        System.out.format(" %-12s%-12s%-12s%-12s%-12s%-12s\n", "Фамилия",   "Квартал1",   "Квартал2",   "Квартал3",   "Квартал4",   "Итого");
        System.out.format("-----------------------------------------------------------------");

double summaAll = 0;
double counter = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            System.out.format("\n %-12s", hash[i]);
            for (j = 0; j < kvartal; j++) {
                counter++;
                sum += array[i][j];
                System.out.format("%7d", array[i][j]);
            }
            summaAll += sum;
            System.out.format("  %-6d \n", sum);
        }
        double med = summaAll/counter;
        System.out.format("\n-----------------------------------------------------------------\n");
        System.out.format(" %-12s   %-8f ", "Итого", summaAll);
        System.out.format("\n %-12s   %-4.6f ", "Средняя", med);
    }
}


