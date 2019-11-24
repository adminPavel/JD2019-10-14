package by.it.komarov.jd01_10;

import by.it.komarov.Param;

import java.lang.reflect.Method;

public class Bean {

    @Param(a = 10, b = 15)
    double sum(int left, int right){
        return left + right;
    }

    @Param(a = 10, b = 15)
    static double max(int left, int right){
        return left<right?right:left;
    }

    @Param(a = 10, b = 15)
    static double min(int left, int right){
        return left>right?right:left;
    }

    @Param(a = 10, b = 15)
    double avg(int left, int right){
        return (left + right)/2.0;
    }

    // modifaer&1 == 00000001
    public static void main(String[] args) {

        Class<Bean> beanClass = Bean.class;
        Method[] declaredMethods = beanClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }

    }

}
