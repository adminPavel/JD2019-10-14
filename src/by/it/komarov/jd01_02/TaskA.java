package by.it.komarov.jd01_02;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }
        step1(mass);
        step2(mass);
        step3(mass);
    }

    private static void step1(int[] mass) {
        System.out.printf("%d %d", findMin(mass), findMax(mass));
    }

    private static void step2(int[] mass) {
        for (int element : mass) {
            if(element < findAvg(mass)){
                System.out.printf("%d ", element);
            }
        }
        System.out.println();
    }

    private static void step3(int[] mass) {
        for (int i = mass.length - 1; i >= 0; i--) {
            if(findMin(mass) == mass[i]){
                System.out.printf("%d ", i);
            }
        }
    }

    private static int findMin(int[] array){
        int min = array[0];
        for (int element : array){
            if(element < min){
                min = element;
            }
        }
        return min;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int element : array) {
            if(element > max) {
                max = element;
            }
        }
        return max;
    }

    private static double findSum(int [] array){
        double sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    private static double findAvg(int[] array){
        return findSum(array) / array.length;
    }
}
