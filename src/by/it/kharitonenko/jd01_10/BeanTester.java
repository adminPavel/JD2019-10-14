package by.it.kharitonenko.jd01_10;

import java.lang.reflect.Method;

public class BeanTester {
    public static void main(String[] args) throws Exception {
        Object b = null;
        Method[] beanMethods = Bean.class.getDeclaredMethods();
        for (Method beanMethod : beanMethods) {
            if (beanMethod.isAnnotationPresent(Param.class)) {
                if (b==null) b = Bean.class.getDeclaredConstructor().newInstance();
                Param param = beanMethod.getAnnotation(Param.class);
                System.out.println(beanMethod.getName());
                System.out.println(beanMethod.invoke(b,param.a(),param.b()));
            }
        }
        }
}