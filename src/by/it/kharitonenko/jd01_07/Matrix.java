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
        strMatrix = strMatrix.
                replaceAll(",\\{", "ppp").
                replaceAll("[{]","").
                replaceAll("[}]","");
        String[] tempStr = strMatrix.split("ppp");
        String[] strMatrixPart1 = tempStr[0].split(",");
        String[] strMatrixPart2 = tempStr[1].split(",");

        this.value = new double[strMatrixPart1.length][strMatrixPart2.length];
        for (int i = 0; i < strMatrixPart1.length; i++) {
            this.value[0][i] = Double.valueOf(strMatrixPart1[i]);
        }
        for (int i = 0; i < strMatrixPart2.length; i++) {
            this.value[1][i] = Double.valueOf(strMatrixPart2[i]);
        }
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
