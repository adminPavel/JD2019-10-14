package by.it.sermyazhko.jd01_07;

class Runner {
    public static void main(String[] args) {
        Var v1 = new Scalar(3.1415);
        Var v2 = new Scalar((Scalar) v1);
        Var v3 = new Scalar("3.1415");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        double[] arr = {1.0, 2.0, 4.0};
        String str = "{1.0, 2.0, 4.0}";
        Var vec1 = new Vector(arr);
        Vector vec2 = new Vector((Vector)vec1);
        Vector vec3 = new Vector(str);

        System.out.println(vec1);
        System.out.println(vec2);
        System.out.println(vec3);


        double[][] mas = { { 1.0, 2.0 },  { 3.0, 4.0 } };
        String ar = "{ {1.0, 2.0 },  { 3.0, 4.0 } }";
        Var m1 = new Matrix(mas);
        Var m2 = new Matrix((Matrix)m1);
        Matrix m3 = new Matrix(ar);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
