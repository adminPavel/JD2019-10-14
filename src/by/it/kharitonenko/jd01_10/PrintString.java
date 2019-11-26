package by.it.kharitonenko.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class PrintString {
    public static void main(String[] args) {
        Class<String> classString = String.class;
        for (Method declaredMethod : classString.getDeclaredMethods()) {
            if (!Modifier.isStatic(declaredMethod.getModifiers()))
                System.out.println(
                        declaredMethod.getName()
                );
        }
    }
}
