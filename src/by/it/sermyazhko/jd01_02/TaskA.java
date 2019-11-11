package by.it.sermyazhko.jd01_02;

import java.util.Scanner;

/**
 * Created by user on 16.10.19.
 */
public class TaskA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }
        step1(mas);
        step2(mas);
        step3(mas);
    }


    private static void step1(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
            {
                min = arr[i];
            }
            if (arr[i] > max)
            {
                max = arr[i];
            }

        }
        System.out.println(min + " " + max);
    }

    public static void step2(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg = sum/arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg)
            {
                System.out.println(arr[i] + " ");
            }
        }
    }

    public static void step3(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == min){
                System.out.print( i + " ");
            }
        }
    }
}
