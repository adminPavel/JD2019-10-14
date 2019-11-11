package by.it.kazak.jd01_07;

import java.util.Arrays;

 class Vector extends Var {

    private double[] value;

    Vector(double[] value) {
        this.value = value;
    }
    Vector(Vector vector) {
         this.value = vector.value;
    }
     public Vector(String strVector){

     }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String d = "";
        for (double element : value) {
        sb.append(d).append(element);
        d = ", ";
        }
        sb.append("}");
        return sb.toString();
    }
 }