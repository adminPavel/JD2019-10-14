package by.it.kazak.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> strMath = Math.class;
        Method[] methods = strMath.getDeclaredMethods();
        for (Method method : methods) {
            if ((method.getModifiers() & Modifier.PUBLIC) ==Modifier.PUBLIC) {
                StringBuilder sb = new StringBuilder("public ");
                sb.append("static ").append(method.getReturnType()).append(" ").append(method.getName()).append("(")
                        .append(Arrays.toString(method.getParameterTypes())
                            .replace("[","")
                                .replace("]","")
                                .replace(" ",""))
                        .append(")");

                System.out.println(sb);
            }
        }
        //i can't understand how to make this part
        System.out.println("double E");
        System.out.println("double PI");
    }
}
