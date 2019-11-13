package by.it.komarov.jd01_07;

public class Runner {
    public static void main(String[] args) {

        double value = 3.1415;
        String line = "12";
        Scalar scalar1 = new Scalar(value);
        Var scalar2 = new Scalar(scalar1);
        Var scalar3 = new Scalar(line);
        System.out.println(scalar1);
        System.out.println(scalar2);
        System.out.println(scalar3);

        double[] array = {1, 2, 4};
        Vector vector1 = new Vector(array);
        Var vector2 = new Vector(vector1);
        System.out.println(vector1);
        System.out.println(vector2);

        double[][] matrix = {{1, 2}, {3, 4}};
        Matrix matrix1 = new Matrix(matrix);
        Var matrix2 = new Matrix(matrix1);
        System.out.println(matrix1);
        System.out.println(matrix2);
    }
}
