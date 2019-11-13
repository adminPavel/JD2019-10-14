package by.it.bodukhin.jd01_08;

class Matrix extends Var {
    private double[][] value;

    Matrix(double[][] value) {
        this.value = value;
    }

    Matrix(Matrix otherMatrix) {
        this.value = otherMatrix.value;
    }

    Matrix(String  strMatrix) {
        String[] mat = strMatrix.replaceAll("[{ }]","").split(",");
        value = new double[2][2];
        for (int i = 0; i < value.length; i++) {
            value[0][i] = Double.parseDouble(mat[i]);
        }
        int j = 0;
        for (int i = 2; i < mat.length; i++) {
            value[1][j] = Double.parseDouble(mat[i]);
            j++;
        }
    }


    public String toString() {
        StringBuilder sb = new StringBuilder("{");

        for (int i = 0; i <value.length-1 ; i++) {
            String delimeter = "";
            sb.append("{");
            for (int j = 0; j < value[0].length; j++) {
                sb.append(delimeter).append(value[i][j]);
                delimeter = ", ";
            }
            sb.append("}, ");
        }
        for (int i = 1; i <value.length ; i++) {
            String delimeter = "";
            sb.append("{");
            for (int j = 0; j < value[0].length; j++) {
                sb.append(delimeter).append(value[i][j]);
                delimeter = ", ";
            }
            sb.append("}");
        }
        sb.append("}");
        return sb.toString();
    }
}
