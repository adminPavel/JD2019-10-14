package by.it.yaroshenko.jd01_04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        final int K=4; //число кварталов в году
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();//ввели с клавиатуры число людей
        String[] array_name = new String[n]; //массив фамилий
        int[][] array = new int[n][K]; //массив ЗП

        for (int j = 0; j < n; j++) {
            String name = scanner.next();
            array_name[j] = name; //массив фамилий
        }
        int total=0; //сумма ЗП за год
        double average=0.0;
//цикл наполняет массив ЗП за год за 4 квартала
        for (int i = 0; i < n; i++) {
            System.out.println("Введите зарплату для " + array_name[i]);
            for (int j = 0; j < K; j++) {
                array[i][j] = scanner.nextInt();
                total +=array[i][j];
                average+=array[i][j];
            }

        }
        average=average/(n*K);
        printArrayTop(K);
        printArrayMain(array_name,array,n,K);
        printArraySumAverage(total,average);
    }
    /**
     * Распечатывает массив на экране
     */
    private static void printArrayTop (int K) {
        System.out.println("------------------------------------------------------------");

        System.out.printf("%-15s%-10s%-10s%-10s%-10s%-10s\n", "Фамилия", "Квартал1", "Квартал2", "Квартал3", "Квартал4", "Итого" );
        }
        private static void printArrayMain(String[] array_name, int[][] array, int n, int K) {
        System.out.println("------------------------------------------------------------");
        for (int j = 0; j < n; j++) {
            System.out.printf("%-15s",array_name[j]+":");
            int sum=0;
        for (int i = 0; i < K; i++) {
            System.out.printf("%-10d", array[j][i]);
            sum+=array[j][i];
        }
        System.out.printf("%-10d\n",sum);
        }
    }
    private static void printArraySumAverage (int total, double average) {
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-15s%-10d\n%-15s%-10.5f", "Итого", total,"Средняя", average);
    }
}
