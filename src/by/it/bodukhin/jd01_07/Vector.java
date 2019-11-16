package by.it.bodukhin.jd01_07;

class Vector extends Var {
    private double[] value;

    Vector(double[] value) {
        this.value = value;
    }

    Vector(Vector otherVector) {
        this.value = otherVector.value;
    }

    Vector(String strVector) {
        String[] str = strVector.replace("{","")
                .replace("}","")
                .split(",");
        value = new double[str.length];
        for (int i = 0; i < str.length; i++) {
            value[i] = Double.parseDouble(str[i]);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String delimeter = "";
        for(double element : value) {
            sb.append(delimeter).append(element);
            delimeter = ", ";
        }
        sb.append("}");
        return sb.toString();
    }
}
