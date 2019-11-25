package by.it.yurtsevich.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> klass = Math.class;
        for (Method method : klass.getDeclaredMethods()){
            int modifiers = method.getModifiers();
                if((method.getModifiers() & Modifier.PUBLIC) ==Modifier.PUBLIC & (method.getModifiers()
                        & Modifier.STATIC) ==Modifier.STATIC){
                    System.out.println(String.valueOf(method).replace("java.lang.Math.",""));
                }
        }
    }
}
