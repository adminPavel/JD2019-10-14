package by.it.sermyazhko.jd01_07;

public class Runner {
    public static void main(String[] args) {
        Var v1=new Scalar(3.1415);
        Var v2=new Scalar((Scalar) v1);
        Var v3=new Scalar("3.1415");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);


        double[] arr = {1.0, 2.0, 4.0};
        String str = "{1.0, 2.0, 4.0}";
        Var vec1 = new Vector(arr);
        Vector vec2 = new Vector((Vector)vec1);
        //Vector vec3 = new Vector(str);


        System.out.println(vec1);
        System.out.println(vec2);
    }
}
