package by.it.kharitonenko.jd01_05;
import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        step1();
        step2();
    }
    private static void step1() {
        double y = 0;
        for (double a = 0; a <= 2 ; a=a+0.2) {
            for (int x = 1; x<=6; x++) {
                y = y + pow(7, a) - cos(x);
            }
            System.out.printf("При a=%2.2f Сумма y = %g\n", a, y);
        }
    }

    private static void step2() {
        double a, x;
        double b = 0;

        for (x = -5.5; x < 2; x = x + 0.5) {
            boolean flag = true;
            if (-2<x/2 && x/2<=-1) {
                b = sin(x*x);
            }
            if (-1<x/2 && x/2<0.2) {
                b = cos(x*x);
            }
            if (x/2 == 0.2) {
                b = cos(x*x)/sin(x*x);
            }
            if (x/2<=-2 || x/2>0.2) {
                flag = false;
            }

            if (!flag) {
                System.out.printf("При x/2=%4.2f вычисления не определены\n", x/2);
            } else {
                a = log10(abs(b + 2.74));
                System.out.printf("При x/2=%4.2f a = %g\n", x/2, a);
            }
        }
    }
}
