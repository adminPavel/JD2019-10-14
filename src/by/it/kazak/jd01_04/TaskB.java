package by.it.kazak.jd01_04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {

        int a = 4;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] s = new String[size];
        int[][] array = new int[size][a];

        for (int j = 0; j < size; j++) {
            String name = sc.next();
            s[j] = name;
        }
        int totalsalary = 0;
        double averagesalary = 0.0;
        for (int i = 0; i < size; i++) {
            System.out.println("Введите зарплату для " + s[i]);
            for (int j = 0; j < a; j++) {
                array[i][j] = sc.nextInt();
                totalsalary+=array[i][j];
                averagesalary+=array[i][j];
            }
            }
        averagesalary = averagesalary/(size*a);
        printTop(a);
        printMid(s,array,size,a);
        printBottom(totalsalary,averagesalary);
        }
    private static void printTop(int a) {
        System.out.println("------------------------------------------------------------");

        System.out.printf("%-15s%-10s%-10s%-10s%-10s%-10s\n", "Фамилия", "Квартал1", "Квартал2", "Квартал3", "Квартал4", "Итого" );
    }
    private static void printMid(String[] s, int[][] array, int size, int a) {
        System.out.println("------------------------------------------------------------");
        for (int j = 0; j < size; j++) {
            System.out.printf("%-15s", s[j] + ":");
            int sum = 0;
            for (int i = 0; i < a; i++) {
                System.out.printf("%-10d", array[j][i]);
                sum += array[j][i];
            }
            System.out.printf("%-10d\n", sum);
        }
    }
    private static void printBottom(int totalsalary, double averagesalary) {
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-15s%-10d\n%-15s%-10.5f", "Итого", totalsalary,"Средняя", averagesalary);
    }
}