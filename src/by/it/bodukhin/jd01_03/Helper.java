package by.it.bodukhin.jd01_03;

 class Helper {
    /**
     *
     * @param arr исходный массив double
     * @return возвращение минимального значения
     */
    static double findMin(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    /**
     *
     * @param arr исходный массив double
     * @return возвращение максимального значения
     */
    static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }

        }
        return max;
    }

    /**
     *
     * @param arr сортировка изначально массива double
     */
    static void sort(double[] arr) {
        int last = arr.length - 1;
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < last; i++) {
                if (arr[i] > arr[i + 1]) {
                    double copy = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = copy;
                    swap = true;
                }
            }
            last--;
        }
        while (swap);
        InOut.printArray(arr);
    }

    /**
     *
     * @param matrix входная матрица
     * @param vector входной вектор
     * @return результат умножения матрицы на вектор
     */
    static double[] mul(double[][] matrix, double[] vector){
        double z[] = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for(int j =0; j<vector.length; j++) {
                z[i] = z[i]+matrix[i][j]*vector[j];

            }

        }

        return z;
    }

    /**
     *
     * @param matrixLeft входная первая матрица
     * @param matrixRight входная вторая матрица
     * @return результат умножения матриц
     */
    static double[][]mul(double[][]matrixLeft, double[][]matrixRight){
        double[][] z = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++) {
            for(int j=0; j<matrixRight[0].length; j++) {
                for(int k=0; k<matrixRight.length; k++) {
                        z[i][j] = z[i][j] + matrixLeft[i][k]*matrixRight[k][j];

                }
            }

        }
        return z;

    }
}
