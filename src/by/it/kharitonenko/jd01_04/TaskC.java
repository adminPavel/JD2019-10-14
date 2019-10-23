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
        double left, right;
        double[] tempArray;

        //if 1 element
        if (array.length == 1) {
            tempArray = new double[1];
        }
        //tempArray creation
        tempArray = new double[array.length/2];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = array[i];
        }

        for (int i = 0; i < tempArray.length; i++) {
            System.out.println(tempArray[i]);
        }
    }

    private static void mergeSort(double[ ] array, int left, int right) {

    }

//    private static double[ ] merge(double[ ] part1, double[ ] part2) {
//
//    }

    static int binarySearch(double[ ] array, double value) {
        return -1;
    }
}
