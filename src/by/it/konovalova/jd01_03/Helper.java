package by.it.konovalova.jd01_03;

public class Helper {
    /**
     * Метод находит минимальное значение в массиве
     *
     * @param arr - входной массив
     * @return минимальное значение в массиве
     */
    static double findMin(double[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double min = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = min;
                }
            }
        }
        return arr[0];
    }

    /**
     * Метод находит максимальное значение в массиве
     *
     * @param arr - входной массив
     * @return максимальное значение в массиве
     */
    static double findMax(double[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    double min = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = min;
                }
            }
        }
        return arr[0];
    }

    /**
     * Метод сортирует массив
     *
     * @param arr - входной массив
     */
    static void sort(double[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double min = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = min;
                }
            }
        }
    }

    /**
     * Метод умножает матрицу на вектор
     *
     * @param matrix - входная матрица
     * @param vector - входной вектор
     * @return произведение матрицы на вектор
     */
   static double[] mul(double[][] matrix, double[] vector) {
            double[] mul = new double[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < vector.length; j++) {
                    mul[i]=mul[i]+matrix[i][j]*vector[j];
                }
            }
            return mul;
        }

    /**
     * Метод умножает матрицу на матрицу
     *
     * @param matrixLeft - входная матрица
     * @param matrixRight - входная матрица
     * @return произведение матрицы на матрицу
     */
    static double[][] mul(double[][] matrixLeft, double[][] matrixRight) {
        double[][] mul = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++) {
            for (int j = 0; j < matrixRight[0].length; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    mul[i][j]=mul[i][j]+matrixLeft[i][k]*matrixRight[k][j];
                }

            }
        }
        return mul;

    }

}
