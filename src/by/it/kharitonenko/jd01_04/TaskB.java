package by.it.kharitonenko.jd01_04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numberPeople = new String[scanner.nextInt()];
        for (int i = 0; i < numberPeople.length; i++) {
            numberPeople[i] = scanner.next();
        }

        int[][] pay = new int[numberPeople.length][4];
        for (int i = 0; i < numberPeople.length; i++) {
            System.out.println("Введите зарплату для " + numberPeople[i]);
            for (int j = 0; j < 4; j++) {
                pay[i][j] = scanner.nextInt();
            }
        }
        int i = 0;
        int year = 0;
        int fullPay = 0;
        for (String name : numberPeople
             ) {
            year = 0;
            System.out.print(name);
                for (int j = 0; j < 4; j++) {
                    System.out.printf(" %4d", pay[i][j]);
                    year = year + pay[i][j];
                }
            i++;
            System.out.printf(" %4d", year);
            fullPay += year;
            System.out.println();
        }
        System.out.println(fullPay);
        System.out.printf("%4.4f",(double)fullPay/(4*numberPeople.length));
    }
}
