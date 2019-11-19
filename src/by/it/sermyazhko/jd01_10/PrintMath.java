package by.it.sermyazhko.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {

    public static void main(String[] args) {
        Class<Math> structure = Math.class;
       //structure.getDeclaredMethod()
        for (Method method : structure.getDeclaredMethods()){
            int modifier = method.getModifiers();
            /*if ((modifier&1)==1){
                System.out.println(method);
            }*/
            if(Modifier.isPublic(modifier)){
                StringBuilder sb = new StringBuilder("public ");
                //sb.append(structure.);
                sb.append(method.getName()).append("(");
                System.out.println(sb);
            }
        }
    }
}
