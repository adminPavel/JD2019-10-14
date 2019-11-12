package by.it.zimina.jd01_03;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        double[] array = InOut.getArray(str);
        InOut.printArray(array);
        InOut.printArray(array, "V", 3);
        double[] arr = {1, 2.0, 4, 5, 4, 0, 5};

        Helper.findMin(arr);
        Helper.findMax(arr);
        Helper.sort(arr);
    }

}
