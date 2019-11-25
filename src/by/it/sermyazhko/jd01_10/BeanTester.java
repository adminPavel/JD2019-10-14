package by.it.sermyazhko.jd01_10;

import java.lang.reflect.Method;

class BeanTester {
    public static void main(String[] args) throws Exception{
        Class<Param> p = Param.class;//annotation
        Method[] declaredMethods = p.getDeclaredMethods();
        Class<Bean> cls = Bean.class;
        try {
            Method[] methods = cls.getDeclaredMethods();
            Object ob = new Object();
            for (Method method : methods) {
                Param annotation = method.getAnnotation(Param.class);
                if (method.isAnnotationPresent(Param.class)) {
                    ob = cls.newInstance();
                    System.out.println(method.invoke((cls.newInstance()),annotation.a(),annotation.b()));
                    System.out.println(method.getName());
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

