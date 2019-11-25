package by.it.kharitonenko.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

class PrintMath {
    public static void main(String[] args) {
        Class<Math> classMath = Math.class;
        for (Field field : classMath.getFields()) {
            if (Modifier.isPublic(field.getModifiers())) {
                System.out.println(
                        Modifier.toString(field.getModifiers()) + " " +
                        field.getType().getSimpleName() + " " +
                        field.getName()
                );
            }
        }
        for (Method declaredMethod : classMath.getDeclaredMethods()) {
            if (Modifier.isPublic(declaredMethod.getModifiers()))
            System.out.println(
                    Modifier.toString(declaredMethod.getModifiers()) + " " +
                    declaredMethod.getReturnType().getSimpleName() + " " +
                    declaredMethod.getName() +
                    typeParameters(declaredMethod.getParameters()) +"\n"
                    );
        }
    }

    //method parameters to string converter
    private static String typeParameters(Parameter[] methodParameters)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        if (methodParameters.length == 0) return stringBuilder.append(")").toString();
        for (int i = 0; i < methodParameters.length; i++) {
            stringBuilder.append(methodParameters[i].getType().getName());
            if (i!=methodParameters.length-1) stringBuilder.append(","); else stringBuilder.append(")");
        }
        return stringBuilder.toString();
    }
}
