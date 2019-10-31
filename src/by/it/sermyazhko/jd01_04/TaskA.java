package by.it.sermyazhko.jd01_04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class TaskA {
    public static void main(String[] args) {
        printMulTable();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //String line = "1 5 9 -6 8 32 78 -3 0 -89";
        buildOneDimArray(str);
    }

    static void printMulTable() {
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%1d*%1d=%-3d",i,j,i*j);
            }
            System.out.println();
        }
    }

    static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        double first = array[0];
        double last = array[array.length - 1];
        System.out.println("Unsorted array");
        InOut.printArray(array,"V", 5);
        Helper.sort(array);
        System.out.println("Sorted array");
        InOut.printArray(array,"V", 4);
        int newFirst = Arrays.binarySearch(array,first);
        System.out.printf("Index of first element=%d", newFirst);
        System.out.println();
        int newLast = Arrays.binarySearch(array, last);
        System.out.printf("Index of last element=%d", newLast);
    }
}
