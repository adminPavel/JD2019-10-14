/**
 * @author Toporova
 * @version 2019/10/20
 */

package by.it.toporova.jd01_04;

import java.util.Arrays;

class Helper {

    /**
     * Находит минимум в одномером массиве
     * @param arr
     * @return значение минимума
     */

    static double findMin(double[] arr) {
        if (arr.length == 0) {
            return Double.MIN_VALUE;

        } else {
            double min = arr[0];
            for (double v : arr) {
                if (v < min) {
                    min = v;
                }
            }
            return min;
        }

    }

    /**
     * Ищет максимальное значение в одномерном массиве
     * @param arr
     * @return значение максимума массива
     */
    static double findMax(double[] arr) {
        if (arr.length == 0) {
            return Double.MAX_VALUE;

        } else {
            double max = arr[0];
            for (double v : arr) {
                if (v > max) {
                    max = v;
                }
            }
            //System.out.println(max);
            return max;
        }
    }

    /**
     * Сортирует данные в одномерном массиве по возрастанию
     * @param arr
     */
    static void sort(double[] arr) {
        Arrays.sort(arr);//метод для сортировки массива

        for (double v : arr) {
            System.out.println(v + " ");
            System.out.println();
        }
    }

    /**
     * Умножает переданный двумерный массив на вектор
     * @param matrix
     * @param vector
     * @return результат умножения mul
     */
    static double[] mul(double[][] matrix, double[] vector) {
        int n = matrix.length;
        double[] mul = new double[n];
        int matrixColLength = matrix[0].length; //длина первого массива в массиве массивов, т.е для [i][j] это будет j
        int vectorRow = vector.length; ///количество рядов ветора== количесту элементов вектора
        if (vectorRow != matrixColLength) return null;

        for (int i = 0; i < matrix.length; i++) { //перебор цикла для матрицы. i элементы перебираются по длине матрицы. Длина матрицы равна кол-ву рядов двумерного массива
            for (int j = 0; j < matrix[i].length; j++) { //перебор j элементов матрицы в рамках i-ряда
                mul[i] = (matrix[i][j] * vector[j]) + mul[i];
            }
        }
        return mul;
    }

    /**
     * Умножает переданный двумерный массив на другой двумерный массив
     * @param matrixLeft
     * @param matrixRight
     * @return результат умножения
     */

        static double[ ][ ] mul(double[ ][ ] matrixLeft, double[ ][ ] matrixRight){
            //int n = matrixLeft.length;
            int matrixLeftColLength = matrixLeft[0].length; //длина первого массива в массиве массивов, т.е для [i][j] это будет j
            int matrixLeftRow = matrixLeft.length; //количество рядов (i) левой матрицы
            int matrixRightColLength = matrixRight[0].length; //длина первого массива в массиве массивов
            int matrixRightRow = matrixRight.length; //количество рядов (i)  правой матрицы
            double[][] mul = new double[matrixLeftRow][matrixRightColLength]; //инициализация матрицы-результата

            if (matrixRightRow != matrixLeftColLength) return null;
            for (int i = 0; i < matrixLeft.length; i++) { // i элементы, количество рядов.
                for (int j = 0; j < matrixLeftColLength; j++) { //j элементы - колонки второй матрицы.
                    for (int k = 0; k < matrixRightColLength; k++) { // i1 элементы - колонки первой матрицы
                        mul[i][k] =(matrixLeft[i][j] * matrixRight[j][k] ) + mul[i][k];
                        System.out.println(mul[i][k] + "  ");

                    }
                }
            }

            return mul;


    }



}