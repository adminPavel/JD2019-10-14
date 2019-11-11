package by.it.konovalova.jd01_05;

import java.util.Arrays;

import static java.lang.Math.*;

public class TaskC {
    public static void main(String[] args) {
        double a[] = new double[28];
        double b[] = new double[28];
        System.out.println("Массив A[]");
        for (int i = 0; i < 28; ) {
            for (double x = 5.33; x <= 9; x = x + 0.135) {
                a[i] = pow((x * x + 4.5), 1.0 / 3.0);
                System.out.printf("A[% -3d] = %6.5f    ", i, a[i]);
                i++;
                if (i % 5 == 0) System.out.println();
            }
            System.out.println();

        }
       // System.out.println(Arrays.toString(a));
        System.out.println("Массив B[] из элементов массива A > 3.5");


        for (int i = 0; i < 28; i++) {
            for (int j = 0; j < 28; j++) {
                if (a[i] > 3.5) {
                    b[j] = a[i];
                    System.out.printf("B[% -3d] = %6.5f    ", j, b[j]);
                    //i++;
                    if (j % 5 == 0) System.out.println();
                   // j++;
                }
                else continue;
            }
        }
    }
}


















