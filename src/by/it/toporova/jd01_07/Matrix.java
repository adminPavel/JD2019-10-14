package by.it.toporova.jd01_07;

import java.util.Arrays;

public class Matrix extends Var {

    private double[][] value;

    Matrix(Matrix matrix) {
        this.value = value;
    }

    Matrix(double[][] value) {
        this.value = Arrays.copyOf(Arrays.copyOf(value, value[0].length), value.length);//копірованіе строк на глубіну value[0].length
    }


    Matrix(String strMatrix) {
        StringBuilder sb = new StringBuilder(strMatrix);
        for (int i = 0; i < 2; i++) {
            sb.deleteCharAt(0).deleteCharAt(sb.length() - 1);
        }
        String str = sb.toString();
        String[] arrStr = str.split("}");
        String[] rowsMatr = new String[arrStr.length];
        rowsMatr[0] = arrStr[0];
        String[] colsInRow = rowsMatr[0].split("[, ]+");
        for (int i = 1; i < arrStr.length; i++) {
            String rowM = arrStr[i].replaceFirst("[, {]+", "");
            rowsMatr[i] = rowM;
        }
        double[][] resMatrix = new double[rowsMatr.length][colsInRow.length];
        for (int i = 0; i < rowsMatr.length; i++) {
            String[] colsM = rowsMatr[i].split("[, ]+");
            for (int j = 0; j < colsM.length; j++) {
                resMatrix[i][j] = Double.parseDouble(colsM[j]);
            }

        }
        this.value = resMatrix;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{{");
      //  AtomicReference<String> delimiter = new AtomicReference<>("");
        String delimiter="";

        for (int i = 0; i < value.length; i++) {

            for (int j = 0; j < value[0].length; j++) {
                sb.append(delimiter).append(value[i][j]);
                if (j<value[0].length-1) {
                    sb.append(", ");
                }
            }
            if (i != value.length - 1) sb.append("}, {");
            else sb.append("}}");
        }
        return sb.toString();
    }
}
