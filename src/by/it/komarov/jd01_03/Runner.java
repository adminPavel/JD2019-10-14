package by.it.komarov.jd01_03;

import java.util.Arrays;

import static by.it.komarov.jd01_03.Helper.mul;

public class Runner {
    public static void main(String[] args) {
        String line = "12 56 34 90 78 123 9";
        double[] array = InOut.getArray(line);
        double[][] matrix = new double[2][2];
        double[] vector = new double[2];
        String arrayName = InOut.setNameArray();
        int columnCount = InOut.setColumnCount();


        InOut.printArray(array);
        InOut.printArray(array, arrayName, columnCount);
        System.out.println(Helper.findMin(array));
        System.out.println(Helper.findMax(array));
        Helper.sort(array);
        System.out.println(Arrays.toString(mul(matrix, vector)));
        System.out.println(Arrays.deepToString(mul(matrix, matrix)));
    }
}
