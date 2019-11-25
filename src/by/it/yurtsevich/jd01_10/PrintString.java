package by.it.yurtsevich.jd01_10;


import java.lang.String;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintString {
    public static void main(String[] args) {
        Class<String> klass = String.class;
        for (Method method : klass.getDeclaredMethods()){
            int modifiers = method.getModifiers();
            if((method.getModifiers() & Modifier.PUBLIC) ==Modifier.PUBLIC){
                System.out.println(String.valueOf(method).replace("java.lang.String.",""));
            }
        }
    }
}
