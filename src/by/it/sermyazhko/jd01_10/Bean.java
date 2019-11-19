package by.it.sermyazhko.jd01_10;

import java.lang.reflect.Method;

public class Bean {

    @Param(a=10,b=15)
    double sum(int left, int right){
        return left + right;
    }

    @Param(a=10,b=15)
    double max(int left, int right){
        return left<right?right:left;
    }

    @Param(a=10,b=15)
    static double min(int left, int right){
        return left<right?left:right;
    }

    static double avg(int left, int right){
        return (left + right)/2.0;
    }
    public static void main(String[] args) {
        Class<Bean> beanClass = Bean.class;
        // Method[] declaredMethod = beanClass.getDeclaredMethod();
        //перебор потом
    }
}
