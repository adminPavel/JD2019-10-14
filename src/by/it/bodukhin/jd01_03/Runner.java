package by.it.bodukhin.jd01_03;


import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        String line = " 12 34 56 78 90 123 9";
        double[] array = InOut.getArray(line);
        InOut.printArray(array);
        InOut.printArray(array, "v", 6);


        double minimum = Helper.findMin(array);
        System.out.println(minimum);
        double maximum = Helper.findMax(array);
        System.out.println(maximum);

        Helper.sort(array);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива и вектора");
        int i = sc.nextInt();
        int j = sc.nextInt();
        double[][] matrix = new double[i][j];
        double[] vector = new double[j];
        System.out.println("Введите данные массива");
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < vector.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Введите данные вектора");
        for(j=0; j<vector.length; j++) {
            vector[j] = sc.nextInt();
        }
        double[] result = Helper.mul(matrix,vector);
        System.out.print("Результат умножения"+" ");
        System.out.println(Arrays.toString(result));

        System.out.println("Введите размер массивов");
        i = sc.nextInt();
        j=sc.nextInt();
        double[][] matrixLeft = new double[i][j];
        System.out.println("Введите данные первого массива");
        for (i = 0; i < matrixLeft.length; i++) {
            for(j=0; j<matrixLeft.length; j++) {
                matrixLeft[i][j]=sc.nextInt();
            }
        }
        double[][] matrixRight = new double[i][j];
        System.out.println("Введите данные второго массива");
        for (i = 0; i < matrixRight.length; i++) {
            for(j=0; j<matrixRight.length; j++) {
                matrixRight[i][j]=sc.nextInt();
            }
        }
        double[][] secondresult = Helper.mul(matrixLeft, matrixRight);
        System.out.print("Результат умножения" + " ");
        System.out.println(Arrays.deepToString(secondresult));
    }
}
