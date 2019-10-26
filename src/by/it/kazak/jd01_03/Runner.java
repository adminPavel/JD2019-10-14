package by.it.kazak.jd01_03;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        String line = " 12 34 56 78 90 123 ";
        double[] array = InOut.getArray(line);
        System.out.println(Arrays.toString(array));
        InOut.printArray(array, "v", 5);
    }
}

