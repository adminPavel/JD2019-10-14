package by.it.kharitonenko.jd01_07;

class Vector extends Var {
    private double[] value;


    Vector(double[] value) {
        this.value = value;
    }
    Vector(Vector otherVector) {
        this.value = otherVector.value;
    }
    Vector(String strVector) {
        strVector = strVector.replaceAll("[}{ ]","");
        String[] tempStr = strVector.split(",");
        this.value = new double[tempStr.length];
        for (int i = 0; i < this.value.length; i++) {
            this.value[i] = Double.valueOf(tempStr[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String delimiter = "";
        for (double element : value) {
            sb.append(delimiter).append(element);
            delimiter = ", ";
        }
        sb.append("}");
        return sb.toString();
    }
}
