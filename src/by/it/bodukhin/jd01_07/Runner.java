package by.it.bodukhin.jd01_07;

class Runner {
    public static void main(String[] args) {
        Var v1 = new Scalar(4.4);
        Var v2 = new Scalar((Scalar) v1);
        Var v3 = new Scalar("123.456");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        double[] vec = {1, 2, 4};
        Var v4 = new Vector(vec);
        Var v5 = new Vector((Vector) v4);
        Var v6 = new Vector("{1, 2, 4}");

        System.out.println(v4);
        System.out.println(v5);
        System.out.println(v6);

        double[][] matr = {{1, 2}, {3, 4}};
        Var v7 = new Matrix(matr);
        Var v8 = new Matrix((Matrix) v7);
        Var v9 = new Matrix("{{1, 2}, {3, 4}}");

        System.out.println(v7);
        System.out.println(v8);
        System.out.println(v9);

    }
}
