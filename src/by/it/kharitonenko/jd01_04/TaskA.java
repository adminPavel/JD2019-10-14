package by.it.kharitonenko.jd01_04;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMulTable();
        buildOneDimArray(scanner.nextLine());
    }
    static void printMulTable() {
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%d*%d=%-2d ", i, j, i*j);
            }
            System.out.println();
        }
    }
    static void buildOneDimArray(String line) {
        double[] arr = InOut.getArray(line);
        InOut.printArray(arr, "V", 5);
        double firstElement = arr[0];
        double lastElement = arr[arr.length-1];
        Helper.sort(arr);
        InOut.printArray(arr, "V", 4);
        for (int i = 0; i < arr.length; i++) {
            if (firstElement == arr[i])
            System.out.printf("Index of first element=%-3d\n", i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (lastElement == arr[i])
                System.out.printf("Index of last element=%-3d\n", i);
        }
    }
}
