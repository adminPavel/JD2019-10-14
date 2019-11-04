package by.it.kharitonenko.jd01_04;

public class TaskC {
    public static void main(String[] args) {
        buildOneDimArray("3 1 0 4 2");
    }

    static void buildOneDimArray(String line) {
        double[] arr = InOut.getArray(line);
        InOut.printArray(arr, "V", 5);
        double firstElement = arr[0];
        double lastElement = arr[arr.length-1];
        mergeSort(arr);
        InOut.printArray(arr, "V", 5);
//        InOut.printArray(arr, "V", 4);
//        for (int i = 0; i < arr.length; i++) {
//            if (firstElement == arr[i])
//                System.out.printf("Index of first element=%-3d\n", i);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (lastElement == arr[i])
//                System.out.printf("Index of last element=%-3d\n", i);
//        }
    }

    static void mergeSort(double[ ] array) {
        // x = middle index
        int x = array.length/2;
        double[] left, right;
        for (int i = 0; i < array.length-x; i++) {
        }
    }

    private static void mergeSort(double[ ] array, int left, int right) {

    }

//    private static double[ ] merge(double[ ] part1, double[ ] part2) {
//        int l,r,x = 0;
//        for (int i = 0; i < part1.length; i++) {
//
//        }
//    }

//    static int binarySearch(double[ ] array, double value) {
//    }
}
