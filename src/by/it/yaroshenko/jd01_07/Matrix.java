package by.it.yaroshenko.jd01_07;

import java.util.Arrays;

public class Matrix extends Var {
    private double[][] value;

    Matrix(double[][] value) {
        this.value = Arrays.copyOf(value, value.length);
    }
    Matrix(Matrix otherMatrix) {
        this.value = otherMatrix.value;
    }
    Matrix(String strValue) {
        StringBuilder sb;
        sb = new StringBuilder(strValue.replaceAll("[{} ]", ""));
        String[] str_array = sb.toString().split("[^\\d.]+");
        double[] one_dimensional_array = new double[str_array.length];
        double[][] matrix = new double[2][one_dimensional_array.length/2];
        for (int i = 0; i < str_array.length; i++) {
            one_dimensional_array[i]=Double.parseDouble(str_array[i]);
        }
        int count=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=one_dimensional_array[count++];
            }
        }
        this.value=matrix;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{{");
        for (int i = 0; i < value.length; i++) {
            String delimiter = "";
            for (int j = 0; j < value[i].length; j++) {
                sb.append(delimiter).append(value[i][j]);
                delimiter=", ";
            }
            if(i<value.length-1) {
                sb.append("}, {");
            }
        }
        sb.append("}}");
        return sb.toString();
    }
}
