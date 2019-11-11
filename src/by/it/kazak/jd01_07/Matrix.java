package by.it.kazak.jd01_07;

public class Matrix extends Var{

    private double[][] value;

    Matrix(double[][] value) {
        this.value = value;
    }
    Matrix(Matrix matrix) {
        this.value = matrix.value;
    }
    public Matrix(String strMatrix){

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String d = "";
        for (double[] element : value) {
            sb.append(d).append(element);
            d = ", ";
        }
        sb.append("}");
        return sb.toString();
    }
}

