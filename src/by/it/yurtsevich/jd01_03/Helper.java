package by.it.yurtsevich.jd01_03;

import java.util.Scanner;
import java.util.Arrays;
public class Helper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array;
        double[][] matrix, matrixLeft, matrixRight;
        double[] vector;
        matrix = new double[5][5];
        matrixLeft = new double[5][];
        matrixRight = new double[5][];
        vector = new double[5];
        array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        findMin(array);
        findMax(array);
        sort(array);
        mul(matrix, vector);
        mul(matrixLeft, matrixRight);
    }

    static double findMin(double[] array) {
        double min = 0;
        for (double element : array) {
            if (min > element) min = element;
        }

        System.out.println(min + " ");
        return min;
    }

    static double findMax(double[] array) {

        double max = 0;
        for (double element : array) {
            if (max < element) max = element;
        }

        System.out.println(max + " ");

        return max;
    }

    static void sort(double[] array) {
        double min = array[0];
        for (double element : array) {
            if (min > element) min = element;
        }
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == min) ;
            System.out.print(i + " ");
        }
    }

    static double[] mul(double[][] matrix, double[] vector) {
        double[] result = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                result[i] = result[i] + matrix[i][j] * vector[j];
            }
        }
        return result;
    }

    static double[][] mul(double[][] matrixLeft, double[][] matrixRight) {
        double[][] result2 = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++) {
            for (int j = 0; j < matrixLeft.length; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    result2[i][j] = result2[i][j] + matrixLeft[i][k] * matrixRight[k][j];
                }
            }
        }
        return result2;
    }
}
