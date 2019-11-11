package by.it.bodukhin.jd01_07;

class Runner {
    public static void main(String[] args) {
        Var v1 = new Scalar(4.4);
        Var v2 = new Scalar((Scalar) v1);
        Var v3 = new Scalar("123.456");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
