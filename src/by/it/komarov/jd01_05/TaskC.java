package by.it.komarov.jd01_05;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskC {
    public static void main(String[] args) {

        ArrayList<Double> arrayListFirst = new ArrayList<>();
        ArrayList<Double> arrayListSecond = new ArrayList<>();

        setArrayListFirst(arrayListFirst);
        getArrayList(arrayListFirst, "A");
        setArrayListSecond(arrayListFirst, arrayListSecond);
        getArrayList(arrayListSecond, "B");
        middleGeometricsValue(arrayListSecond);

        int[] arrFirst = new int[31];
        int[] arrSecond = new int[31];

        setRandomArray(arrFirst);
        printArray(arrFirst);
        createSortArray(arrFirst, arrSecond);
        printArray(arrSecond);


    }

    private static void setArrayListFirst(ArrayList<Double> arrayListFirst){
        int index = -1;
        for (double x = 5.33; x <= 9.0 ; x += 0.15) {
            index++;
            arrayListFirst.add(index, Math.pow((x*x) + 4.5, 1.0/3.0));
        }
    }

    private static void setArrayListSecond(ArrayList<Double> arrayListFirst, ArrayList<Double> arrayListSecond){
        int index = -1;
        for (Double element : arrayListFirst) {
            if (element > 3.5) {
                index++;
                arrayListSecond.add(index, element);
            }
        }
    }

    private static void getArrayList(ArrayList<Double> arrayList, String name){
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != 0) {
                if (i % 5 == 0) {
                    System.out.println();
                }
                System.out.printf("%s[%2d]=%3.6f  ", name,  i, arrayList.get(i));
            }
        }
        System.out.println();
    }

    private static void middleGeometricsValue(ArrayList<Double> arrayList){
        double middleGeom = 0;
        for (double element: arrayList) {
            middleGeom += element;
        }
        System.out.printf("\nMiddle Geometrics Value: %3.6f\n", Math.sqrt(middleGeom));
    }

    private static void setRandomArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = 103 + (int)(Math.random() * 405);
        }
    }

    private static void createSortArray(int[] first, int[] second){
        System.arraycopy(first, 0, second, 0, first.length);
        Arrays.sort(second);
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Array[%2d] = %3d", i, array[i]);
        }
        System.out.println();
    }
}
