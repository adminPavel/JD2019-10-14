package by.it.konovalova.jd01_07;

import java.util.Arrays;

class Vector extends Var {

    private double[] value;

    Vector(double[] value) {
        this.value = value;
    }

    Vector(Vector otherVector) {
        this.value = otherVector.value;
    }

    public Vector(String strVector) {
        strVector=strVector.replaceAll("\\{","");
        strVector=strVector.replaceAll("\\}","");
        String[] arr = strVector.split(",");
        double [] arr1= new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Double.parseDouble(arr[i]);
        }
        this.value = arr1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String delimiter = "";
        for (double v : value) {
            sb.append(delimiter).append(v);
            delimiter = ", ";
        }
        sb.append("}");
        return sb.toString();
    }
}
