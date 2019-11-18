package by.it.sermyazhko.jd01_09;

import java.util.Scanner;

class ConsoleRunner {
    private static void print(Var var) {
        if (var!=null)
            System.out.println(var);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Printer printer=new Printer();
        Parser parser=new Parser();
        for(;;){
            String str = scanner.nextLine();
            if (str.equals("end"))
                break;
            System.out.println("!!!"+parser.calc(str));
            Var result = parser.calc(str);//{{1,2},{8,3},{1,8}}*{{1,2},{8,3}}

            printer.print(result);
        }

    }
}