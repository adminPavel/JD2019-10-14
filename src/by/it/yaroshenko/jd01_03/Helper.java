package by.it.yaroshenko.jd01_03;
import java.util.Arrays;

/**
 * @author Pavel Yaroshenko
 * @version 1.1
 *
 */
 class Helper{
    /**
     *
     * @return на выходе минимальное значение max в массиве
     */
    static double findMin(double[ ] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        double min=arr[0];
        for (double element : arr) {
            if (element<min) {
                min=element;
            }
        }
        return min;
    }

/**
 * @return на выходе максимальное значение max в массиве
 *
*/

    static double findMax(double[ ] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        double max=arr[0];
        for (double element : arr) {
            if(element>max) {
                max=element;
            }

          }
        return max;
    }

    /**
     * The method sorts an array
     * @param arr array to be sorted
     */
     static void sort(double[ ] arr) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    /**
     *
     * @param matrix two-dimensional array
     * @param vector one-dimensional array
     * @return matrix and vector multiplication
     */
    static double[ ] mul(double[ ][ ] matrix, double[ ] vector) {

        double[] matrix_result_1 = new double [matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                matrix_result_1[i] = matrix_result_1[i]+matrix[i][j]*vector[j];
            }
        }
        return matrix_result_1;
    }

    /**
     *
     * @param matrixLeft two-dimensional array
     * @param matrixRight two-dimensional array
     * @return matrix and matrix multiplication
     */
    static double[ ][ ] mul(double[ ][ ] matrixLeft, double[ ][ ] matrixRight) {
        double[][] matrix_result_2 = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++) {
            for (int j = 0; j < matrixRight[0].length; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    matrix_result_2[i][j] = matrix_result_2[i][j]+matrixLeft[i][k]*matrixRight[k][j];
                }
            }
        }


        return matrix_result_2;
    }

    /**
     *
     * @param m two-dimensional array
     * @return transformed array to String format
     */
    public static String toString(double[][] m) {
        String result = "";
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                result += String.format("%11.2f", m[i][j]);
            }
            result += "\n";
        }
        return result;
    }

    /**
     *
     * @param m one-dimensional array
     * @return transformed array to String format
     */
    public static String toString(double[] m) {
        String result = "";
        for(int i = 0; i < m.length; i++) {

                result += String.format("%11.2f", m[i]);

            result += "\n";
        }
        return result;
    }

    }


