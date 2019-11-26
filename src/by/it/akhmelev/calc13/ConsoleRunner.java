package by.it.akhmelev.calc13;

import java.util.Scanner;

public class ConsoleRunner {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Printer printer=new Printer();
        Parser parser=new Parser();
        for(;;){
            String expression=scanner.nextLine();
            if (expression.equals("end"))
                break;
            Var result= null;
            try {
                result = parser.evaluate(expression);
                printer.print(result);
            } catch (CalcException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
