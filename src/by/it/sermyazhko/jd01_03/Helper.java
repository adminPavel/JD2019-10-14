package by.it.sermyazhko.jd01_03;

class Helper {
    static double findMin(double[ ] arr){
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    static double findMax(double[ ] arr){
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static void sort(double[ ] arr){
        int count = arr.length-1;
        for (int i = 0; i < arr.length - 1; i++) {
            int transposition = 0;
            for (int j = 0; j < count; j++) {
                if(arr[j]>arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    transposition++;
                }
            }
            //If you do not have transposition - exit -> Array sorted
            if (transposition == 0){
                break;
            }
            count--;
        }
    }

    static double[] mul(double[][] matrix, double[] vector) {
        double[] arr = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[i] = arr[i] + matrix[i][j]*vector[j];
            }
        }
        return arr;
    }

    static double[][] mul(double[][] matrixLeft, double[][] matrixRight) {
        double[][] arr = new double[matrixLeft.length][matrixRight[0].length];
        for (int i = 0; i < matrixLeft.length; i++) {
            for (int j = 0; j < matrixRight[0].length; j++) {
                for (int k = 0; k < matrixRight.length; k++) {
                    arr[i][j] = arr [i][j] + matrixLeft[i][k]*matrixRight[k][j];
                }
            }
        }
       return arr;
    }
}
