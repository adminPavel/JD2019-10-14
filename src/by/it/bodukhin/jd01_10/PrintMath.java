package by.it.bodukhin.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> structure = Math.class;
        Method[] methods = structure.getDeclaredMethods();
        for(Method method : methods) {
            if((method.getModifiers() & Modifier.PUBLIC) ==Modifier.PUBLIC) {
                System.out.println("public static " + method.getReturnType()
                +" "+ method.getName()
                        + Arrays.toString(method.getParameterTypes())
                        .replace("[","(")
                        .replace("]",")")
                        .replace(" ",""));
            }
        }

        System.out.println();

        Field[] fields = structure.getDeclaredFields();
        for(Field field : fields) {
            if ((field.getModifiers() & Modifier.PUBLIC) == Modifier.PUBLIC) {
                System.out.println(field.getType() + " " + field.getName());
            }
        }
    }
}
