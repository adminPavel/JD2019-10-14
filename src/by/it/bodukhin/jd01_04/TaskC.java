package by.it.bodukhin.jd01_04;

import java.util.Arrays;


public class TaskC {
    public static void main(String[] args) {
        String line = "12 43 -21 78 -145 123 9";
        buildOneDimArray(line);
        //double[] array = InOut.getArray(line);
        //InOut.printArray(array);
        //InOut.printArray(array, "v", 6);
    }

    static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        System.out.println("Unsorted array");
        InOut.printArray(array, "V", 5);
        double[] mergesorted = new double[array.length];
        mergesorted = mergeSort(array);
        System.out.println("Sorted array");
        InOut.printArray(mergesorted, "V", 5);

        //System.out.printf("Index of first element=%d\n", Arrays.binarySearch(array,first));

        //System.out.printf("Index of last element=%d\n",Arrays.binarySearch(array, last));
    }

    static double[] mergeSort(double[] array) {
        int len = array.length;
        if (len < 2) {
            return array;
        }
        int middle = len / 2;
        return merge(mergeSort(Arrays.copyOfRange(array, 0, middle)),
        mergeSort(Arrays.copyOfRange(array, middle, len)));
    }

    static double[] merge(double[] part1, double[] part2) {
        int len_1 = part1.length, len_2 = part2.length;
        int a = 0, b = 0;
        int len = len_1 + len_2;
        double[] result = new double[len];
        for (int i = 0; i < len; i++) {
            if (b < len_2 && a < len_1) {
                if (part1[a] > part2[b]) {
                    result[i] = part2[b++];
                } else result[i] = part1[a++];
            } else if (b < len_2) {
                result[i] = part2[b++];
            } else {
                result[i] = part1[a++];
            }

        }
        return result;
    }
}

