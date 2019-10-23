package by.it.komarov.jd01_04;

import java.util.Arrays;

public class TaskC {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] =(int) Math.random()*20;
        }
        for (int v1 : array) {
            System.out.println(v1);
        }

        mergeSort(array,0,9);

        for (int v : array) {
            System.out.println(v);
        }
    }


    static void mergeSort(double[ ] array){

    }

    private static void mergeSort(int[ ] array, int left, int right){
        int middle;
        if(left < right){
            middle = (left + right) / 2;
        }

    }

}
