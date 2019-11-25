package by.it.komarov.jd01_09;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;

         Parser parser = new Parser(); // передаем вычисления
         Printer printer = new Printer(); // выводит результат


        while(!(line = scanner.nextLine()).equals("end")){
            Var result = parser.calc(line);
            printer.print(result);
        }

    }
}
