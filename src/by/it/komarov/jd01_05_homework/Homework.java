package by.it.komarov.jd01_05_homework;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Input size of array: ");
        int sizeArr = scanner.nextInt();
        int[] array = new int[sizeArr];
        String[] line = new String[array.length];



        System.out.print("Input elements of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            line[i] = Integer.toString(array[i]);
        }

        for (int i = 0; i < line.length; i++) {
            System.out.printf("Line:%s\n", line[i]);
        }

        for (int i = 0; i < line.length; i++) {
            System.out.println(line[i].length());
        }














    }


}
