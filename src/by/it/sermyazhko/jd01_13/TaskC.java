package by.it.sermyazhko.jd01_13;

import java.text.Format;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class TaskC {
    static byte countOfErrors = 0;
    static Scanner scan;
    static ArrayList<String> ar = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        scan = new Scanner(System.in);
        try{
            for (;;){
                readData() ;
            }
        }catch (Exception e){
            //System.out.println(e.getClass().getName());

              //  throw new Exception(e.getClass().getName());

           /* String className ="";
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement element : stackTrace) {
                if (element.getClassName().equals(TaskB.class.getName())) {
                    int lineNumber = element.getLineNumber();
                    className = element.getClassName();
                }
               // System.err.println(Exception.class.getName());
            }*/
            //System.out.println("!"+className);

            throw new Exception();



        }

    }
    static void readData() throws Exception{
        try{
            String s = scan.nextLine();
            double v = Double.parseDouble(s);
            ar.add(s);
        }catch (Exception e){
                Thread.sleep(100);
            ++countOfErrors;
            if(countOfErrors==5) {
               // String className ="";
               // StackTraceElement[] stackTrace = e.getStackTrace();
               /* for (StackTraceElement element : stackTrace) {
                    if (element.getClassName().equals(TaskB.class.getName())) {
                        int lineNumber = element.getLineNumber();
                        className = element.getClassName();
                    }
                   // System.err.println(Exception.class.getName());
                }*/
                //System.out.println(className);
                //throw new Exception(className);
                throw new Exception();
                //System.out.println(Exception.class.getName());
                //throw new Exception(Exception.class.getName());

                    }
            else {
                System.out.println();
                for (int i = ar.size() - 1; i >= 0; i--) {
                    //System.out.format("%10.1f%s", ar.get(i)," ") ;
                    System.out.print( ar.get(i)+".0" + " ");
                }
            }

        }
    }
}
