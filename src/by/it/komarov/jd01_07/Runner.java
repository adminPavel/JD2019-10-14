package by.it.komarov.jd01_07;

public class Runner {
    public static void main(String[] args) {

        double[] array = {1, 2, 4};
        Var v1 = new Scalar(3.1415);
        Var v2 = new Vector(array);

        System.out.println(v1.toString());
        System.out.println(v2.toString());


        double[][] matrix = {{1, 2}, {3, 4}};
        Matrix v4 = new Matrix(matrix);

        Var v5 = new Matrix(v4);
        System.out.println(v5.toString());


    }
}
