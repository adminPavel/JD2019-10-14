package by.it.zimina.jd01_07;

class Matrix extends Var{

    private double[][] value;

    Matrix(double[][] value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("{");
        String delimiter="";
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                 sb.append(delimiter).append(value[i][j]);
                 delimiter=", ";
            }
        }
        sb.append("}");
        return  sb.toString();
    }
}
