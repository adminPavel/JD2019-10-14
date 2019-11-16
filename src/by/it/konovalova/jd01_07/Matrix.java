package by.it.konovalova.jd01_07;

class Matrix extends Var {

    private double[][] value;

    public Matrix(double[][] value) {
        this.value = value;
    }

    Matrix(Matrix matrix) {
        this.value = matrix.value;
    }

    public Matrix(String strMatrix) {
        strMatrix = strMatrix.replaceAll("\\{\\{", "");
        strMatrix = strMatrix.replaceAll("\\}\\}", "");
        String s1[] = strMatrix.split("\\},\\{");
        String matrix[][] = new String[s1.length][s1.length];

        for (int i = 0; i < s1.length; i++) {
            String single_int[] = s1[i].split(",");

            for (int j = 0; j < single_int.length; j++) {
                matrix[i][j] = single_int[j];
            }
        }

        double[][] arr = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arr[i][j] = Double.parseDouble(matrix[i][j]);
            }
        }
        this.value = arr;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{{");
        String delimiter = "";
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                sb.append(delimiter).append(value[i][j]);
                delimiter = ", ";
            }
            delimiter = "}, {";
        }
        sb.append("}}");
        return sb.toString();
    }
}