package by.it.kazak.jd01_03;

import java.util.Arrays;
public class Helper {
    /**
     *
     * @param arr одномерный массив
     * @return
     */
    static double findMin(double[] arr) {
        if (0 == arr.length) {
            return Double.MIN_VALUE;
        } else {
            double min = arr[0];
            for (double array : arr) {
                if (min > array) min = array;
                System.out.print("Минимум="+min+" ;");
            }
            return min;
        }
    }

    /**
     *
     * @param arr одномерный массив
     * @return
     */
    static double findMax(double[ ] arr) {
        if (0 == arr.length) {
            return Double.MAX_VALUE;
        } else {
            double max = arr[0];
            for (double array : arr) {
                if (max < array) max = array;
                System.out.print("Максимум="+max+" ;");
            }
            return max;
        }
    }

    /**
     *
     * @param arr одномерный массив
     */
    public static void sort(double[] arr) {
        Arrays.sort(arr);
        for (double i = 0; i < arr.length; i++) {
            System.out.print(arr[(int) i]+ " ");
            }
        }
    static double[ ] mul(double[ ][ ] matrix, double[ ] vector) {
        double[] a = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                a[i] = a[i] + matrix[i][j] * vector[j];
            }
        }
        return a;
    }

    /**
     *
     * @param matrixLeft двухмерный массив
     * @param matrixRight двухмерный массив
     * @return возвращает двухмерный массив a
     */
    static double[ ][ ] mul(double[ ][ ] matrixLeft, double[ ][ ] matrixRight) {
        double[][] a = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++) {
            for (int j = 0; j < matrixRight[0].length; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    a[i][j] = a[i][j] + matrixLeft[i][k] * matrixRight[k][j];
                }
            }
        }
        return a;
    }
}