package by.it.komarov.jd01_07;

public class Matrix extends Var{

    private double[][] matrix;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    Matrix(Matrix matrix) {
        this.matrix = matrix.matrix;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String delimiter = "";

        for (int i = 0; i < matrix.length; i++) {
            if(i == 1)
            sb.append(", ");

            sb.append("{");

            for (int j = 0; j < matrix.length; j++) {
                sb.append(delimiter).append(matrix[i][j]);
                delimiter = ", ";
            }
            sb.append("}");
            delimiter = "";
        }
        sb.append("}");
        return sb.toString();
    }
}
