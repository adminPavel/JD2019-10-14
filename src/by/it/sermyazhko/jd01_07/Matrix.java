package by.it.sermyazhko.jd01_07;

import java.util.Arrays;

class Matrix extends Var {

    private double[][] val;

    Matrix(double[][] value) {
        val = new double[value.length][];
        for (int i = 0; i < value.length; i++) {
            val[i] = Arrays.copyOf(value[i],value[0].length);
        }
    }

     Matrix(Matrix matrix){
          val = new double[matrix.val.length][];
         for (int i = 0; i < matrix.val.length; i++) {
             val[i] = Arrays.copyOf(matrix.val[i], matrix.val[0].length);
         }
     }

      Matrix(String strMatrix){
          String [] array = strMatrix.split("(},)");
          val = new double[array.length][];
          for (int i = 0; i < val.length; i++) {
              String[] temp = (array[i].replaceAll("[{}]","")).split("[,]");
              val[i] = new double[temp.length];
              for (int j = 0; j < temp.length; j++) {
                  val[i][j] = Double.parseDouble(temp[j]);
              }
          }
     }

    @Override
    public String toString() {
        StringBuilder arr = new StringBuilder();
        arr.append("{ {");
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val[0].length; j++) {
                arr.append(val[i][j]);
                if(j < val[0].length - 1)
                arr.append(",");
            }
           if(i < val.length - 1){
               arr.append("},  {");
           }
        }
        arr.append("} }");
        return arr.toString();
    }
}
