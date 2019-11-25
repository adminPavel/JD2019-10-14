package by.it.yaroshenko.jd01_07;

public class Runner {
    public static void main(String[] args) {
        Scalar v1=new Scalar(4.4);
        Var v2=new Scalar(v1);
        Var v3=new Scalar("123.456");

        double[] array = {1.0,2.0,4.0};
        Vector vec1 = new Vector(array);
        Var vec2 = new Vector(vec1);
        Var vec3 = new Vector("{1.0,2.0,4.0}");

        double[][] two_dimensional_array = { { 1.0, 2.0 }, { 3.0, 4.0 } };
        Matrix matrix1 = new Matrix(two_dimensional_array);
        Var matrix2 = new Matrix(matrix1);
        Var matrix3 = new Matrix("{ { 1.0, 2.0 }, { 3.0, 4.0 } }");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        System.out.println(vec1);
        System.out.println(vec2);
        System.out.println(vec3);

        System.out.println(matrix1);
        System.out.println(matrix2);
        System.out.println(matrix3);
    }
}
