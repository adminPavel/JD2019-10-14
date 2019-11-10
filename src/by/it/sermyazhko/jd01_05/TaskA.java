package by.it.sermyazhko.jd01_05;

import java.sql.SQLOutput;

public class TaskA {
    public static void main(String[] args) {
        final double a = 756.13;
        final double x = 0.3;
        step1(a,x);
        final double a_1 = 1.21;
        final double b = 0.371;
        step2(a_1,b);
        double a_start = -5;
        double a_end = 12;
        double del = 3.75;
        double x_1 = 12.1;
        step3(a_start, a_end, del, x_1);

    }

    private static void step3(double a_start, double a_end, double del, double x) {
        double f = 0;
        for (double a = a_start; a <= a_end; a += del) {
            f = Math.pow(Math.E, a * x) - 3.45 * a;
            System.out.printf("При a=%6.2f f= %g\n",a,f);
        }
    }

    private static void step2(double a, double b) {
        double y;
        double d = Math.pow((a + b),2);
        y = Math.sin(d)/Math.cos(d) - Math.pow((a + 1.5),1/3.0) + a*Math.pow(b,5) - b/(Math.log(Math.pow(a,2)));
        System.out.printf("y = %g\n",y);
    }

    private static void step1(double a, double x) {
        double z,z_1;
        double b, b_1,b_2;
        double c;
        double d;
        double e, e_1, e_2;
        double f, f_1;
        double j, j_1;
        double h;

        z_1 = Math.cos(Math.pow(Math.pow(x,2) + Math.PI/6, 5)) - Math.sqrt(x * Math.pow(a,3)) - Math.log(Math.abs((a - 1.12*x)/4));
        System.out.printf("z = %f\n", z_1);

        b =  Math.PI/6;
        b_1 = Math.pow(x,2);
        b_2 = b + b_1;
        c = Math.pow(b_2,5);
        d = Math.cos(c);

        e = Math.pow(a,3);
        e_1 = x * e;
        e_2 = Math.sqrt(e_1);

        f = 1.12*x;
        f_1 = a - f;
        j = f_1/4;
        j_1 = Math.abs(j);
        h = Math.log(j_1);
        z = d - e_2 - h;
        System.out.printf("z = %f\n", z);
    }
}
