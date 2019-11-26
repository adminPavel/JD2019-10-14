package by.it.kharitonenko.jd01_07;

class Matrix extends Var {
    private double[][] value;

    Matrix(double[][] value) {
        this.value = value;
    }

    Matrix(Matrix otherMatrix) {
        this.value = otherMatrix.value;
    }

    Matrix(String strMatrix) {
        String[] strArray = strMatrix.replaceAll("\\},", "xxx").
                replaceAll(" ", "").
                replaceAll("\\}","").
                replaceAll("\\{","").
                trim().split("xxx");

        String[] strRowMatrix = strArray[0].trim().split("[,]");
        double[][] lineMatrix = new double[strArray.length][strRowMatrix.length];

        for (int i = 0; i < strArray.length; i++) {
            strRowMatrix = strArray[i].trim().split("[,]");
            for (int j = 0; j < strRowMatrix.length; j++) {
                lineMatrix[i][j] = Double.parseDouble(strRowMatrix[j]);
            }
        }
        this.value = lineMatrix;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String delimiter = "";
        for (int i = 0; i < this.value.length; i++) {
            sb.append("{");
            for (int j = 0; j <this.value[i].length; j++) {
                sb.append(delimiter).append(this.value[i][j]);
                delimiter = ", ";
            }
            delimiter = "";
            if (i!=this.value.length-1) sb.append("}, ");
            else
            sb.append("}");
        }
        sb.append("}");
        return sb.toString();
    }
}
