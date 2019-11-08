/**
 * @author Toporova
 * @version 2019/10/20
 */

package by.it.toporova.jd01_03;

public class InOut {



    /**
     * Преобраование переданного с клавиатуры ряда чисел в одномерный массив
     * @param line
     * @return массив
     */
    static double[] getArray(String line) {
        //line = "12 34 56 90 123 99"
        String[] strArray = line.split(" ");
        double[] array = new double[strArray.length]; //объявление массива результата, в качестве длинны будет длина преобраованной строки
        for (int i = 0; i < strArray.length; i++) {     //цикл для перевода строки в массив в double формате
            array[i] = Double.parseDouble(strArray[i]);   //каждый итый элемент double массива будет равен конвертированному элементу стрингового массива
            System.out.println(array[i] + " ");
        }

        System.out.println();

        return array;
    }

    /**
     * Печать строки, преобразованной в массив
     * @param arr
     */
    static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

    }

    /**
     * Формализованная печать преобразованного массива
     * @param arr массив, полученный из введенной строки
     * @param name
     * @param columnCount - количество колонок, на которые нужно разделить массив
     */

    static void printArray(double[] arr, String name, int columnCount){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[%-3d]=%-10.4f ", name, i, arr[i] );
            if((i+1)%columnCount==0 || i+1==arr.length) {
                System.out.println();
            }



        }


    }






}
