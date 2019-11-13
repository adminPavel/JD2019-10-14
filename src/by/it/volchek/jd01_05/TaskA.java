package by.it.volchek.jd01_05;


public class TaskA {
    public static void main(String[] args) {
        kz1();
        kz2();
        kz3();
    }

    private static void kz1 (){
        double a = 756.13;
        double x = 0.3;
        double zPart;
        double first = Math.cos(Math.pow((x*x+Math.PI/6), 5));
        double scnd = Math.sqrt(x*Math.pow(a,3));
        double thrd = Math.log(Math.abs((a-1.12*x)/4));
        zPart = first - scnd - thrd;
        double zLine = Math.cos(Math.pow((x*x+ Math.PI / 6), 5)) - Math.sqrt(x * Math.pow(a, 3)) - Math.log(Math.abs((a - 1.12 * x) / 4));
        System.out.println("z=" + zPart);

    }

    private static void kz2 () {
        double a = 1.21;
        double b = 0.371;
        double y = Math.tan(Math.pow((a + b), 2)) - Math.cbrt(a + 1.5) + a * Math.pow(b, 5) - b / Math.log(Math.pow(a, 2));
        System.out.println("y="+y);
    }
    private static void kz3 () {
        double x = 12.1;
        for (double a = -5; a <= 12; a += 3.75) {
            double f = Math.pow(Math.E, a * x) - 3.45 * a;
            System.out.println("a=" + a + " f=" + f);
        }
    }
}
