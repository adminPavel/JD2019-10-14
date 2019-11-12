package by.it.toporova.jd01_07;

import java.util.Arrays;

class Vector extends Var {
private double [] value;

     Vector(double[] value) {
         this.value = Arrays.copyOf(value,value.length);
         System.out.println("double123 " + value);
    }

    Vector(String strVector){//b3
        StringBuilder sb = new StringBuilder(strVector);//
        sb.deleteCharAt(0).deleteCharAt(sb.length() - 1);
        String str = sb.toString();
        String[] arrayString = str.split("[^\\d.]+");//объявление массива и разделение строки на массив по нечисловым разделителям и точке
        double[] arrayDouble = new double[arrayString.length]; //объявление double массива длинной равной длине строкового
        for (int i = 0; i < arrayString.length; i++) { //перебор строкового массива и запись в double
            arrayDouble[i] = Double.parseDouble(arrayString[i]);
        }
        this.value = arrayDouble;
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
