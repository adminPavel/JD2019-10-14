package by.it.kharitonenko.jd01_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TaskA3 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int positionZero = 0;

        for (; ; ) {
            String command = scanner.next();
            if (command.equals("end")) break;
            Integer number = Integer.valueOf(command);
            if (number < 0) integers.add(number);
            else if (number == 0) integers.add(positionZero, number);
            else
                integers.add(positionZero++, number);
        }
        System.out.println(integers);
    }
}
