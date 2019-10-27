package by.it.komarov.jd01_04;

import java.util.Arrays;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {

        String line = "23 45 65 23 54 65 13 41 31 45 64 78 45";

        printMulTable();
        buildOneDimArray(line);

        Scanner scanner = new Scanner(System.in);
        String line2 = scanner.nextLine();

        buildOneDimArray(line2);

    }
    private static void printMulTable(){

        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%1d*%1d=%-2d ", i, j, i*j);
            }
            System.out.println();
        }
    }

    private static void buildOneDimArray(String line) {

        double[] array = InOut.getArray(line);
        System.out.println("Unsorted array");
        InOut.printArray(array, "V", 5);
        double first = array[0];
        double last = array[array.length-1];
        Helper.sort(array);
        System.out.println("Sorted array");
        InOut.printArray(array, "v", 4);

        System.out.printf("%nIndex of first element=%d", Arrays.binarySearch(array, first));
        System.out.printf("%nIndex of last element=%d", Arrays.binarySearch(array, last));
    }
}

