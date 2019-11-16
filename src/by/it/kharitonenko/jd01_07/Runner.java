package by.it.kharitonenko.jd01_07;

class Runner {
    public static void main(String[] args) {
        Var s1 = new Scalar(3.1415);
        Var s2 = new Scalar(new Scalar(3.1415));
        Var s3 = new Scalar("3.1415");

        Var v1 = new Vector(new double[]{1.0,2.0,4.0});
        Var v2 = new Vector(new Vector(new double[]{1.0,2.0,4.0}));
        Var v3 = new Vector("{1.0,2.0,4.0}");
        System.out.println(v3.toString());

        Var m1 = new Matrix(new double[][]{{2.0,3.2},{3.1,42.1}});
        System.out.println(m1.toString());
        Var m2 = new Matrix("{{21.4, 321.4}, {123.2, 98.2}}");
        System.out.println(m2.toString());
    }
}
