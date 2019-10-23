package by.it.komarov.jd01_02;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int i = sc.nextInt(); // .var

        int[] mass = new int[10];
        // mass.fori
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }
        step1(mass);
        step2(mass);
        step3(mass);

    }

    private static void step1(int[] mass) {
        int min = mass[0];
        int max = mass[0];

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }

            if(mass[i] > max){
                max = mass[i];
            }
        }
        System.out.print(min + " " + max);
    }

    private static void step2(int[] mass) {
        double sum = 0;

        // mass.for
        for (int element : mass) {
            sum += element; // операция приводится к типу double автоматически
        }
            double avg = sum / mass.length;
        for (int element : mass) {
            if(element < avg){
                System.out.print(element + " ");
            }
        }
        System.out.println();



    }

    private static void step3(int[] mass) {
        int min = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
        }
        for (int i = mass.length - 1; i >= 0; i--) {
            if(min == mass[i]){
                System.out.print(i + " ");
            }
        }
    }
}
