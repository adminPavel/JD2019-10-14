package by.it.komarov.jd01_03;


import java.util.Arrays;

class Helper {

    static double findMin(double[ ] arr){
        double min = arr[0];
        for (double element : arr) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }

    static double findMax(double[ ] arr){
        double max = arr[0];
        for (double element : arr) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }

    static void sort(double[ ] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for (int j = 0; j < i; j++)
                if (arr[j] > arr[j + 1]) {
                    double clone = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = clone;
                }
        }
        for (double v : arr) {
            System.out.println(v);
        }
    }
    static double[] mul(double[ ][ ] matrix, double[ ] vector) {
        double[] z = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                z[i] = z[i] + matrix[i][j] * vector[j];
            }
            System.out.println(Arrays.toString(z));
        }
        return z;
    }

    static double[ ][ ] mul(double[ ][ ] matrixLeft, double[ ][ ] matrixRight){
        double[][] z = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++) {
            for (int j = 0; j < matrixRight[0].length; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    z[i][j] = z[i][j] + matrixLeft[i][k] * matrixRight[k][j];
                }
            }
        }
        return z;
    }
}




