package by.it.konovalova.jd01_07;

public class RunnerC {

    public static void main(String[] args) {

        Matrix v1 = new Matrix(new double[][] { { 1.0, 2.0 }, { 3.0, 4.0 } });
        Var v2 = new Matrix((Matrix) v1);
        Var v3 = new Matrix("{{1.0,2.0},{3.0,4.0}}");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
