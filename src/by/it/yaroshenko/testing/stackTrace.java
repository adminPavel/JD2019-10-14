package by.it.yaroshenko.testing;


import java.util.Arrays;

public class stackTrace {
    public static void addPositiveNumbers (int a, int b) throws Exception{
        if (a < 0 || b < 0) {
            throw new Exception("Numbers a not positive");
        } else {
            System.out.println(a+b);
        }
    }
    public static void main(String[] args) throws Exception{
        try{
            addPositiveNumbers(3, -2);
        } catch (Throwable e) {
            StackTraceElement[] stackTraceElements = e.getStackTrace();

            for (int i = 0; i < stackTraceElements.length; i++) {
                System.out.println("Index " + i +" of stack trace"
                        + " array contains = " + stackTraceElements[i]);
            }
        }
    }
}
