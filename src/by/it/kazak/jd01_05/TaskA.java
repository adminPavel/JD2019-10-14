package by.it.kazak.jd01_05;

public class TaskA {
    public static void main(String[] args) {
        step1();
        step2();
        step3();
    }
    private static void step1 () {
        double a = 756.13;
        double x = 0.3;
        double i = (Math.pow(x, 2));
        double q = Math.PI / 6;
        double w = i + q;
        double e = Math.pow(w, 5);
        double r = Math.cos(e);
        double t = Math.pow(a, 3);
        double l = x * t;
        double u = Math.sqrt(l);
        double o = a - 1.12 * x;
        double p = o / 4;
        double s = Math.abs(p);
        double d = Math.log(s);
        double z = r - u - d;
        System.out.println(z);

        double m = (Math.cos(Math.pow(x, 2) + Math.pow((Math.PI / 6), 5))) - (Math.sqrt(x * Math.pow(a, 3))) - (Math.log(Math.abs((a - 1.12 * x) / 4)));
        System.out.println(z);
    }

        private static void step2 () {
        double a = 1.21;
        double b = 0.371;
        double q = Math.pow((a + b), 2);
        double w = Math.tan(q);
        double f = a+1.5;
        double g = Math.cbrt(f);
        double r = Math.pow(b, 5);
        double t = a * r;
        double u = b / (Math.log(Math.pow(a, 2)));
        double y = w - g + t - u;
        System.out.println(y);
    }
        private static void step3 () {
            double x = 12.1;
            for (double a = -5; a <= 12; a = a + 3.75) {
                double f=Math.exp(a*x)-3.45*a;
                System.out.printf("При a=%6.2f f=%g\n", a, f);
            }
        }
}
