package by.it.baranovskaya.jd01_02;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 10 чисел: ");
        int mas[] = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }
        step1(mas);
        step2(mas);
        step3(mas);
    }

    private static void step1(int[] mas) {
        int min = mas[0];
        int max = mas[0];
        for (int element : mas) {
            if (min > element) {
                min = element;
            }
            if (max < element) {
                max = element;
            }
        }
        System.out.println(min + " " + max);
    }
    private static void step2(int[] mas) {
        double average = 0;
        for (int element : mas) {
            average = average + element;
        }
        average = average / mas.length;
        for (int element : mas) {
            if (element < average) {
                System.out.print(element + " ");

            }
        }
        System.out.print("\n");
    }
    private static void step3(int[] mas) {
        int min = mas[0];
        for (int element : mas) {
            if (min > element) {
                min = element;
            }
        }
            for (int i = mas.length-1; i>=0; i--) {
                if (mas[i] == min) {
                    System.out.print(i + " ");
                }
            }
        }
    }
