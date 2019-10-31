package by.it.sermyazhko.jd01_05;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaskC {
    public static void main(String[] args) {
        double x_start = 5.33;
        double x_end = 9.0;
        testTaskC1(x_start, x_end);
        double a_start = 103;
        double a_end = 405;
        int size = 31;
        testTaskC2(a_start, a_end, size);

    }

    private static void testTaskC2(double a_start, double a_end, int size) {
        double[] mas = new double[size];
        double x;
        int temp = 0;
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            x = Math.random() * (a_end - a_start) + a_start;
            BigDecimal bd = new BigDecimal(Double.toString(x));
            bd = bd.setScale(1, RoundingMode.HALF_UP);
            mas[i] = bd.doubleValue();
            if (0.1 * mas[i] > i){
                ++count;
            }
        }
        double[] arr = new double[count];
        for (int j = 0; j < arr.length; j++) {
            for (int i = temp; i < mas.length; i++) {
                if(0.1 * mas[i] > i){
                    arr[j] = mas[i];
                    temp = i + 1;
                    break;
                }
            }
        }
        //sort B
        by.it.sermyazhko.jd01_04.TaskC.mergeSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("Массив A[]");
        printArrayPsev(mas,"A",5);
        System.out.println();
        System.out.println("Массив B[]");
        printArrayPsev(arr,"B",5);
    }

    //Реализовать + вывод по напр строк
    public static void printArrayPsev(double[] arr, String name, int columnCount) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-1s[%3d]=%-10.1f", name, i, arr[i]);
            if((i+1) % columnCount == 0 || i == arr.length - 1){
                System.out.println();
            }
        }
    }

    private static void testTaskC1(double x_start, double x_end) {
        double[] mas = new double[28];
        double z = 0;
        double x = 0;
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            x = Math.random() * (x_end - x_start) + x_start;
            mas[i] = Math.pow(((Math.pow(x,2))+4.5),1.0/3);
            if(mas[i] > 3.5)
            {
                ++count;
            }
        }
        String name = "A";
        System.out.println("Массив A[]");
        printArray(mas, name, 5);
        double arr[] = new double[count];
        double res = 1.0;
        int temp = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = temp; i < mas.length; i++) {
                if(mas[i] > 3.5){
                    arr[j] = mas[i];
                    res *= arr[j];
                    temp = i + 1;
                    break;
                }
            }
        }
       // System.out.println("res=" + res);
        double average = Math.pow(res, 1.0/count);
        String nameB = "B";
        System.out.print("\nМассив B[] из элементов массива A > 3.5\n");
        printArray(arr, nameB, 5);
        System.out.printf("Среднее геометрическое значение массива B = %20.10f\n", average);
    }

    public static void printArray(double[] arr, String name, int columnCount) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-1s[%3d] = %-8.3f", name, i, arr[i]);
            if((i+1) % columnCount == 0 || i == arr.length - 1){
                System.out.println();
            }
        }
    }
}
