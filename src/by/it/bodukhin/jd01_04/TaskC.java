package by.it.bodukhin.jd01_04;

import java.util.Arrays;

public class TaskC {
    public static void main(String[] args) {

    }
    static void buildOneDimArray(String line){
        double[] array = InOut.getArray(line);
        System.out.println("Unsorted array");
        InOut.printArray(array, "V", 5);
        double first=array[0];
        double last=array[array.length-1];
        Helper.sort(array);
        System.out.println("Sorted array");
        InOut.printArray(array, "V", 4);

        System.out.printf("Index of first element=%d\n", Arrays.binarySearch(array,first));

        System.out.printf("Index of last element=%d\n",Arrays.binarySearch(array, last));
    }
    static  void mergeSort(double[]array){

    }
}
