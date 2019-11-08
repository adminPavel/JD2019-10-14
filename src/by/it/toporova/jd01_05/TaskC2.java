package by.it.toporova.jd01_05;

import java.util.Arrays;

public class TaskC2 {
    public static void main(String[] args) {
        array31();
    }

    private static void array31() {
        int n = 31;
        int[] array = new int[n];

        for (int element = 0; element < array.length; element++) {
            array[element] = (int) (Math.random() * 347 + 103);
        }
        System.out.println(Arrays.toString(array));

        generateFromArray31(array);

    }

    private static void generateFromArray31(int[] array) {
        int count = array.length;
        boolean[] compare = new boolean[count];
        int count2 = 0;
        for (int k = 0; k < array.length; k++) {
            int num = (array[k] / 100 * 10);
            if (num > k) {
                compare[k] = true;
                count2++;
            }

        }
        printF(array);
        // System.out.println(Arrays.toString(array));


        int indN = 0;
        int[] arrayN = new int[count2];
        // int num = Math.round(array[i]/100.0*10.0);
        for (int i = 0; i < array.length; i++)
            if (compare[i]) {
                arrayN[indN] = array[i];
                indN++;
            }
        Arrays.sort(arrayN);
        System.out.println(Arrays.toString(arrayN));
        printF2(arrayN);
    }


    private static void printF(int[] arr) {
        System.out.printf("%1s%13s%1s%13s%1s%13s%1s%13s%1s%13s%1s\n", "╔", "═════════════", "╦", "═════════════", "╦", "═════════════", "╦", "═════════════", "╦", "═════════════", "╗");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%1s%1s[%-2d] = %5d", "║", "A", i, arr[i]);
            if ((i + 1) % 5 == 0 || i + 1 == arr.length) {
                System.out.printf("%1s", "║");

                if(i + 1 == arr.length){
                    System.out.printf("%13s%1s", "             ", "║");
                    System.out.printf("%13s%1s", "             ", "║");
                    System.out.printf("%13s%1s", "             ", "║");
                    System.out.printf("%13s%1s", "             ", "║");
                }
                System.out.println();
            }
            if ((i + 1) % 5 == 0) {
                System.out.printf("%1s%13s%1s%13s%1s%13s%1s%13s%1s%13s%1s", "╠", "═════════════", "╬", "═════════════", "╬", "═════════════", "╬", "═════════════", "╬", "═════════════", "╣");
                System.out.println();
            }

            if (i + 1 == arr.length) {
                //System.out.println();
                //System.out.printf("%1s%13s", "║","             " );
                //System.out.println();
                System.out.printf("%1s%13s%1s%13s%1s%13s%1s%13s%1s%13s%1s", "╚", "═════════════", "╩", "═════════════", "╩", "═════════════", "╩", "═════════════", "╩", "═════════════", "╝");
                System.out.println();
            }
        }
    }

    private static void printF2(int[] array) {
        System.out.println();
        int mid;
        if (array.length % 2 == 0) {
            mid = array.length / 2;
        } else {
            mid = array.length / 2 + 1;
        }

        System.out.println("mid: " + mid);
        System.out.println(array.length);

        int first = mid;
        System.out.println("first: " + first);
        int second = array.length - first;
        System.out.println("secomd: " + second);

        System.out.printf("%1s%13s%1s%13s%1s\n", "╔", "═════════════", "╦", "═════════════", "╗");

        for (int i = 0; i < mid; i++) {
            System.out.printf("%1s%1s[%-2d] = %5d", "║", "B", i, array[i]);
            if (i < (second)) {
              System.out.printf("%1s%1s[%-2d] = %5d", "║", "B", first, array[first]);
              //second--;
              first++;
            }

            System.out.printf("%1s", "║");

            if (i == second) {
                System.out.printf("%13s%1s", "             ", "║");
            }

            System.out.println();
            if (i == mid-1) {
                System.out.printf("%1s%13s%1s%13s%1s\n", "╚", "═════════════", "╩", "═════════════", "╝");
            } else {
                System.out.printf("%1s%13s%1s%13s%1s\n", "╠", "═════════════", "╬", "═════════════", "╣");
            }

        }
    }
}
