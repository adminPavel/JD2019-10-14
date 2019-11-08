/**
 * @author Toporova
 * @version 2019/10/20
 */
package by.it.toporova.jd01_03;

import java.util.Scanner;

public class Runner {
    /**
     * Вызывает методы классов Helper, InOut
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();

        double[] arr = InOut.getArray(key);//ввод: вызов Класса InOut метода getArray(key).var и нажать enter --> IDE пропишет то, что мы получим.
        InOut.printArray(arr);
        InOut.printArray(arr, "V", 2);
        double minimum = Helper.findMin(arr);
        double maximum = Helper.findMax(arr);
        Helper.sort(arr);
        double[] getVector = Runner.vectorGenerate();
        double[][] matrix = Runner.matrixGenerate();
        double[] result = Helper.mul(matrix, getVector);
        double[][] getSecondMatrix = Runner.secondMatrixGenerate();
        double[][] resultTwoArray = Helper.mul(matrix, getSecondMatrix);



    }

    /**
     * Генерирует матрицу заданного размера
     * @return double[][]
     */
     static double[][] matrixGenerate() {
        double[][] matrix = new double[3][3];

        for (int i = 0; i < matrix.length; i++) {
            //matrix[i] = new double[3];

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.random() * 100.0;
                matrix[i][j] = Math.round(matrix[i][j] * 100.0) / 100.0;
                System.out.print(matrix[i][j] + "  ");

            }

            System.out.println();
        }
        System.out.println();
        //System.out.println(Arrays.toString(matrix));

        return matrix;
    }

    /**
     * Генерирует вектор заданного размера
     * @return double[]
     */
    static double[] vectorGenerate() {
        double[] vector = new double[3];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (Math.random() * 100.0);
            vector[i] = Math.round(vector[i] * 100.0) / 100.0;
            System.out.print(vector[i] + " ");
        }
        return vector;

    }


    /**
     * Генерируем еще одну матрицу заданных размеров, где j совпадает с i первой матрицы
     * @return double[][]
     */
    static double[][] secondMatrixGenerate() {
        double[][] secondMatrix = new double[3][4];
        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                secondMatrix[i][j] = Math.random() * 10.0;
                secondMatrix[i][j] = Math.round(secondMatrix[i][j] * 100.0) / 100.0;
                System.out.print(secondMatrix[i][j] + "  ");
            }
        }

        return secondMatrix;
    }
}