package by.it.yurtsevich.jd01_07;

import java.util.Arrays;

class Vector extends Var {
    public double[] getValue() {
        return value;
    }

    private double [] value;

        Vector( double[] value){ this.value = value; }
        Vector(Vector vector) { this.value = vector.value; }
        Vector(String strVector) {
            this.value = stringToVector(strVector);
        }

    private static double[] stringToVector(String str) {
        str = str.replaceAll("[^0-9\\.]+", " ");
        str = str.trim();
        String[] strArray = str.split(" ");
        double[] result = new double[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            result[i] = Double.parseDouble(strArray[i]);
        }
        return result;
    }
    public String toString () {
        StringBuilder sb = new StringBuilder("{");
        String delimeter = "";
        for (double element : value) {
            sb.append(delimeter).append(element);
            delimeter = ", ";
        }
        sb.append("}");
        return sb.toString();
    }
}
