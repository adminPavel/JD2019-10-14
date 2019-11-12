package by.it.komarov.jd01_07;

public class Runner {
    public static void main(String[] args) {

        double value = 3.1415;
        Scalar scalar1 = new Scalar(value);
        Var scalar2 = new Scalar(scalar1);
        Var scalar3 = new Scalar("12");

        double[] array = {1, 2, 4};
        String line = "1.0,2.0,4.0";
        Vector vector1 = new Vector(array);
        Var vector2 = new Vector(vector1);
        Var vector3 = new Vector(line);

        System.out.println(vector1.toString());
        System.out.println(vector2.toString());
        System.out.println(vector3.toString());

        double[][] matrix = {{1, 2}, {3, 4}};
        Matrix matrix1 = new Matrix(matrix);
        Var matrix2 = new Matrix(matrix1);



    }
}
