package by.it.yaroshenko.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static java.lang.reflect.Modifier.isStatic;

public class BeanTester{
    public static void main(String[] args) throws Exception {
        Class<Bean> beanClass = Bean.class;
        Class<Param> paramClass = Param.class;
        Method[] declaredMethods = beanClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if(method.isAnnotationPresent(paramClass)) {
                int paramA = (int) paramClass.getMethod("a").invoke(method.getAnnotation(paramClass));
                int paramB = (int) paramClass.getMethod("b").invoke(method.getAnnotation(paramClass));
                double sum;
                Object o = beanClass.getDeclaredConstructor().newInstance();//создать экземпляр класса
                sum = (double) method.invoke(o, paramA, paramB);
                System.out.println("Метод "+method.getName()+",результат "+sum);
            }
        }
    }
}
