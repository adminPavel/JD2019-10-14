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
        for (double[] element: value) {
            sb.append(delimiter).append(element);
            delimiter=", ";
        }
        sb.append("}");
        return  sb.toString();
    }
}
