package by.it.yaroshenko.jd01_09;

//import by.it.yaroshenko.jd01_08.Scalar;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix extends Var {
    private double[][] value;

    public double[][] getValue() {
        return value;
    }

    Matrix(double[][] value) {
        this.value = Arrays.copyOf(value, value.length);
    }
    Matrix(Matrix otherMatrix) {
        this.value = otherMatrix.value;
    }
    Matrix(String strValue) {
        String[] str_array = strValue.split("},");
        String[] w=new String[0];
        StringBuilder sb = new StringBuilder(Arrays.toString(str_array));
        Pattern pattern = Pattern.compile("[\\d.d]+");
        Matcher matcher= pattern.matcher(sb);
        while (matcher.find()) {
            int last=w.length; //Последнй элемент
            w= Arrays.copyOf(w, last+1); //копируем массив, увеличиваем его на 1
            w[last]=matcher.group(); //запомним слово
    }
        int count=0;
        int row=str_array.length;
        int col=w.length/str_array.length;
        double[][] matrix = new double[row][col];
        for (int i = 0; i < str_array.length; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j]=Double.parseDouble(w[count]);
                count++;
            }
        }
      this.value=matrix;
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar) {
            Matrix array = new Matrix(Arrays.copyOf(value, value.length));
            for (int i = 0; i < value.length; i++) {
                for (int j = 0; j < value[i].length; j++) {
                    value[i][j] += ((Scalar) other).getValue();
                }
            }
            return array;
        } else if (other instanceof Matrix) {
            double[][] array = Arrays.copyOf(value, value.length);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] += ((Matrix) other).getValue()[i][j];
                }
            }
            return new Matrix(array);
        }
            return super.add(other);
        }

    @Override
    public Var sub(Var other) {
        if (other instanceof Scalar) {
            double[][] array = Arrays.copyOf(value, value.length);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] -= ((Scalar) other).getValue();
                }
            }
            return new Matrix(array);
        } else if (other instanceof Matrix) {
            double[][] array = Arrays.copyOf(value, value.length);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] -= ((Matrix) other).value[i][j];
                }
            }
            return new Matrix(array);
        }
        return super.sub(other);
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
