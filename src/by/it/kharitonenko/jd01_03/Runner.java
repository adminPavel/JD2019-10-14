package by.it.kharitonenko.jd01_03;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        InOut.printArray(InOut.getArray(scanner.nextLine()));
//        InOut.printArray(InOut.getArray(scanner.nextLine()), "v", 3);
        Helper.sort(new double[] {1.2,2,4,51.9,-1.123, 0, 213, -886, 4.2, 94.5});
    }
}
