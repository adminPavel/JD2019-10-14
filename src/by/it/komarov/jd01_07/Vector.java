package by.it.komarov.jd01_07;

class Vector extends Var {
    private double[] value = new double[10];

    Vector(double[] value) {
        this.value = value;
    }

    Vector(Vector vector) {
        this.value = vector.value;
    }

    Vector(String str) {
        String[] line = str.split(",");

        for (int i = 0; i < this.value.length; i++) {
            this.value[i] = Double.parseDouble(line[i]);
        }
    }


    @Override
    public String toString(){

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
