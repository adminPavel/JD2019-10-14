package by.it.toporova.jd01_10;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class BeanTester {
    public static void main(String[] args) throws Exception {
        Class<Bean> testBean = Bean.class;
        Class<Param> testParam = Param.class; //аннотация
       Method[] declaredMethods = testParam.getDeclaredMethods();//методы


//Обработка исключений в Java основана на использовании в программе следующих ключевых слов:
//try – определяет блок кода, в котором может произойти исключение;
//catch – определяет блок кода, в котором происходит обработка исключения;
//finally – определяет блок кода, который является необязательным, но при его наличии выполняется в любом случае независимо от результатов выполнения блока try.
//Эти ключевые слова используются для создания в программном коде специальных обрабатывающих конструкций: try{}catch, try{}catch{}finally, try{}finally{}.
//throw – используется для возбуждения исключения;
//throws – используется в сигнатуре методов для предупреждения, о том что метод может выбросить исключение.

        try {
            Method a = Param.class.getMethod("a");
            Method b = Param.class.getMethod("b");
            Object ob = Bean.class.getDeclaredConstructor().newInstance();

            Method[] beanMethods = Bean.class.getDeclaredMethods();

            for (Method beanMethod : beanMethods) {
               // Param annotation = beanMethod.getAnnotation(Param.class);
                if (beanMethod.isAnnotationPresent(Param.class)) {
                    Annotation annotation = beanMethod.getAnnotation(Param.class);
                    int aVal = (int) a.invoke(annotation);
                    int bVal = (int) b.invoke(annotation);
                    double result = (double)beanMethod.invoke(ob, aVal, bVal);
                    System.out.println(beanMethod.getName() +  result);
                }
            }

        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
