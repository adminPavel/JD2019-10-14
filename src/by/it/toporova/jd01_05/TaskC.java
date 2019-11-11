package by.it.toporova.jd01_05;


import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class TaskC {
    public static void main(String[] args) {

        double[] array = array();
        step1(array);
        step2(array);

    }

    private static double[] array() {
        //Scanner in = new Scanner(System.in);
        //int counter = in.nextInt();
        int n = 28;
        double[] array = new double[n];
        double min = 5.33;
        double max = 9.00;
        double x;

        System.out.printf("%-25s", "Массив А[]");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            Random rand = new Random();
            x = Math.round(rand.doubles(min, (max)).findFirst().getAsDouble() * 10000.0) / 10000.0;
            array[i] = Math.cbrt(x * x + 4.5);
        }
        return array;
    }


    private static void step1(double[] arr) {
        int columnCount = 5;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\t%1s[%-3d] = %7.5f", "A", i, arr[i]);
            if ((i + 1) % columnCount == 0 || i + 1 == arr.length) {
                System.out.println();
            }
        }
        System.out.println();
    }


    private static void step2(double[] array) {

        int count = array.length;
        boolean[] compare = new boolean[count];

        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3.5) {
                compare[i] = true;
                count2++;
            }
        }


        double[] result = new double[count2];
        int i = 0;
        for (int i1 = 0; i1 < array.length; i1++) {
            if (compare[i1]) {
                result[i] = array[i1];
                i++;
            }
        }

        System.out.printf("%40s", "Массив B[] из элементов массива А > 3.5");
        System.out.println();

        for (int j = 0; j < result.length; j++) {
            System.out.printf("\t%1s[%-3d] = %7.5f", "B", j, result[j]);
            if ((j + 1) % 5 == 0 || j + 1 == result.length) {
                System.out.println();
            }
        }
        endCount(result);
    }


    private static void endCount(double[] arr) {
        double mulp = 1;
        for (double v : arr) {
            mulp = v * mulp;
        }
        double geomResult;
        geomResult = Math.pow(mulp, 1.0 / arr.length);
        System.out.println(geomResult);

    }






}






