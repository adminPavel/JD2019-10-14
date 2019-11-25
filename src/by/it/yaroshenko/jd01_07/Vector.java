package by.it.yaroshenko.jd01_07;

import java.util.Arrays;

public class Vector extends Var{
    private double[] value;

    Vector(double[] value) {
        this.value = Arrays.copyOf(value, value.length);
    }
    Vector(Vector otherVector) {
        this.value = otherVector.value;
    }
    Vector(String strValue) {
        String[] array_str = strValue.replaceAll("[{}]", "").split("[^\\d.]+");
        double[] array_double = new double[array_str.length];
        for (int i = 0; i < array_str.length; i++) {
           array_double[i]=Double.parseDouble(array_str[i]);
        }
        this.value=array_double;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String delimiter = "";
        for (double element:value) {
            sb.append(delimiter).append(element);
            delimiter=", ";
        }
        sb.append("}");
        return sb.toString();
    }
}
