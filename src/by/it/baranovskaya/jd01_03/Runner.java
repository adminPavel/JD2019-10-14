package by.it.baranovskaya.jd01_03;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        double[] array = InOut.getArray(str);
        InOut.printArray(array);
        InOut.printArray(array, "V", 3);
        System.out.println(Helper.findMin(array));
        System.out.println(Helper.findMax(array));
        Helper.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

           // double[] res1 = Helper.mul(matrix, vector);
          //  System.out.println(res1);
        }
    }



