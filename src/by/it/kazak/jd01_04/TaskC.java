package by.it.kazak.jd01_04;
import by.it.kazak.jd01_03.InOut;

import java.util.Arrays;

public class TaskC {
    static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        System.out.println("Unsorted array");
        InOut.printArray(array, "V", 5);
        double first = array[0];
        double last = array[array.length - 1];
        System.out.println();
        System.out.println("Sorted array");
        InOut.printArray(array, "V", 5);
        System.out.println("");
        System.out.printf("Index of first element=%d",
                Arrays.binarySearch(array, first));
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == last) {
                System.out.printf("Index of last element=%d", i);
                break;
            }
        }
    }


}
