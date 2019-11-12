package by.it.toporova.jd01_07;

import java.util.Arrays;

class Vector extends Var {
private double [] value;

     Vector(double[] value) {
         this.value = value;
    }

    Vector(String strVector){
       // this.value=Double.parseDouble(strVector);
    }
    Vector(Vector vector){ //прием экземпляра класса
        this.value=vector.value; //обращение к классу вектор
    }


    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("{");
        String delimiter="";
        for (double element : value) {
            sb.append(delimiter).append(element);
            delimiter=", ";

        }
        sb.append("}");

        return sb.toString();
    }
}
