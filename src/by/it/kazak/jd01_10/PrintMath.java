package by.it.kazak.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> strMath = Math.class;
        Method[] methods = strMath.getDeclaredMethods();
        for (Method method : methods) {
            if ((method.getModifiers() & Modifier.PUBLIC) == Modifier.PUBLIC) {
                StringBuilder sb = new StringBuilder("public ");
                sb.append("static ").append(method.getReturnType()).append(" ").append(method.getName()).append("(")
                        .append(Arrays.toString(method.getParameterTypes()).replace("[", "")
                                .replace("]", "").replace(" ", "")).append(")");
                System.out.println(sb);
            }
        }
        Field[] fields = Math.class.getFields();
        for (Field field : fields) {
            int mod = field.getModifiers();
            if (Modifier.isPublic(mod)) {
                if (Modifier.isStatic(mod)) {
                    System.out.println(String.valueOf(field.getType()) + ' ' + field.getName());
                }
            }
        }
    }
}