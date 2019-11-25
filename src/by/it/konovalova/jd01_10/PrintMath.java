package by.it.konovalova.jd01_10;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> structMath = Math.class;
        Method[] methods = structMath.getDeclaredMethods();
        Field[] declaredFields = structMath.getDeclaredFields();
        for (Method method : methods) {
            if ((method.getModifiers() & Modifier.PUBLIC) == Modifier.PUBLIC) {
                String[] name = method.toString().split(" ");
                String[] name1 = method.toString().split("\\(");
                System.out.println(name[0] + " " + name[1] + " " + name[2] + " " + method.getName() + "(" + name1[1]);
            }
        }
        for (Field declaredField : declaredFields) {
            if ((declaredField.getModifiers() & Modifier.PUBLIC) == Modifier.PUBLIC) {
                System.out.println(declaredField.getType() + " " + declaredField.getName());
            }
        }
    }
}




