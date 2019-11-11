package by.it.zimina.jd01_03;

import java.util.Scanner;

public class Helper {

    static double findMin(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min = " + min);
        return min;

    }

    static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);
        return max;
    }

    static void sort(double[] arr) {
        double temp;
        boolean sorted = false;
        while (!sorted){
//            for (int j = 0; j < arr.length; j++) {
                sorted = true;
                for (int i = 0; i < arr.length-1; i++) {
                    if (arr[i + 1] < arr[i]) {
                        temp = arr[i + 1];
                        arr[i + 1] = arr[i];
                        arr[i] = temp;
                        sorted = false;
                    }
                }

//            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

