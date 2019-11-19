package by.it.kazak.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class PrintString {
    public static void main(String[] args) {

        Class<String> stringClass = String.class;
        Method[] strings = stringClass.getDeclaredMethods();
        for (Method method : strings) {
            if ((method.getModifiers() & Modifier.STATIC) !=Modifier.STATIC);



            System.out.println(method.getName());
        }
    }
}
