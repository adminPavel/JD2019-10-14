package by.it.komarov.jd01_03;

import java.util.Scanner;

class InOut {

    static double[] getArray(String line){
        String[] strArray = line.trim().split(" ");
        int sizeArray = strArray.length;
        double[] array = new double[sizeArray];

        for (int i = 0; i < strArray.length; i++) {
            array[i] = Double.parseDouble(strArray[i]);
        }
        return array;
    }

    static void printArray(double[] arr){
        for (double element : arr){
            System.out.printf("%6.2f\n",element);
        }
        System.out.println();
    }

    static void printArray(double[] arr, String name, int columnCount){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d]=%-6.2f ", name, i, arr[i]);
            if((i+1)%columnCount==0){
                System.out.println();
            }
        }
    }

    static String setNameArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Array Name: ");
        return scanner.nextLine();
    }

    static int setColumnCount(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Column Count: ");
        return scanner.nextInt();
    }
}
