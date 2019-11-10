package by.it.kharitonenko.jd01_03;

/**
 * @author Andrew
 * @version 1.0
 */

public class Helper {
    /**
     * this method will find the minimum value in an array
     * @param arr array
     * @return array minimum
     */
    static double findMin(double[ ] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    /**
     * this method will find the maximum value in an array
     * @param arr array
     * @return array maximum
     */
    static double findMax(double[ ] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;

    }
    /**
     * array bubble sorting
     * @param arr array to sort
     */
    static void sort(double[ ] arr) {
        double temp;
        boolean done;
        do {
            done = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    done = false;
                }
            }
        } while (done == false);
    }
    /**
     * matrix * vector
     * @param matrix
     * @param vector
     * @return result
     */
    static double[] mul(double[ ][ ] matrix, double[ ] vector) {
        double[] result = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < vector.length; j++)
                result[i] = result[i] + matrix[i][j] * vector[j];
        return result;
    }
    /**
     * matrix * matrix
     * @param matrixLeft
     * @param matrixRight
     * @return result
     */
    static double[][] mul(double[ ][ ] matrixLeft, double[ ][] matrixRight) {
        double[][] result = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++) {
            for (int j = 0; j < matrixRight[0].length; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    result[i][j] = result[i][j] + matrixLeft[i][k] * matrixRight[k][j];
                }
            }
        }
        return result;
    }
}
