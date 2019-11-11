package by.it.konovalova.jd01_03;


import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        double[] array = InOut.getArray(str);
        InOut.printArray(array);
        InOut.printArray(array, "v", 6);
        Helper.findMin(array);
        Helper.findMax(array);
        Helper.sort(array);
        double[][] matrix = {
                {11, 12, 13},
                {14, 15, 16}
        };
        double[] vector = {17, 18, 19};
        Helper.mul(matrix, vector);
    }
}
