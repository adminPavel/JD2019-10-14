package by.it.sermyazhko.jd01_07;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Vector extends Var {

    private double[] value;

    public Vector(double[] value) {
        this.value = Arrays.copyOf(value,value.length);
    }

    public Vector(Vector vector) {
        this.value = Arrays.copyOf(vector.value,vector.value.length);
    }

    public Vector(String strVector){
        String str = strVector.replaceAll("[{}]","");
        System.out.println("!!!"+str);
        String[] arr = str.split(",");
        double[] mas = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            mas[i] = Double.parseDouble(arr[i]);
        }
        this.value = Arrays.copyOf(mas,mas.length);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < value.length; i++) {
            sb.append(value[i]);
            if(i==value.length-1)
            {
                break;
            }
            sb.append(", ");
        }
        sb.append("}");
        return sb.toString();
    }
}
