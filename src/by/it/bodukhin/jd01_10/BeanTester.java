package by.it.bodukhin.jd01_10;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class BeanTester {
    public static void main(String[] args) throws Exception {
        Method a = Param.class.getMethod("a");
        Method b = Param.class.getMethod("b");
        Object instance = Bean.class.getDeclaredConstructor().newInstance();
        Class<?> structure = Bean.class;
        Method[] methods = structure.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(Param.class)) {
                System.out.println(method.getName());
                Annotation an = method.getAnnotation(Param.class);
                int aValue = (int) a.invoke(an);
                int bValue = (int) b.invoke(an);
                double result = (double) method.invoke(instance,
                        aValue, bValue);
                System.out.println(result);
            }
        }
    }
}
