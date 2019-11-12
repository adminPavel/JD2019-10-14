package by.it.baranovskaya.jd01_05;

import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        step1();
        step2();
    }
    private static void step1() {
        for (double a = 0; a <=2 ; a = a + 0.2) {
        for (int x = 1; x <= 6; x++) {
            double y = pow(7, a) - cos(x);
            y = y + pow(7, a) - cos(x);
                             System.out.printf("При a=%1.2f Сумма y=%E\n", a, y);
                         }
        }
    }
    private static void step2() {
        double a, b;
        for (double x = -6; x <= 2 ; x = x + 0.5) {
            if ((x/2) > -2 & (x/2) <= -1) {
                b = sin(x*x);
                a = log (abs( b + 2.74));
                System.out.printf("При x/2=%1.2f a=%E\n", x, a);
                System.out.println();
            }
            if ((x/2) > -1 & (x/2) <= 0.2) {
                b = cos(x*x);
                a = log (abs( b + 2.74));
                System.out.printf("При x/2=%1.2f a=%E\n", x, a);
                System.out.println();
            }
            if ((x/2) == 0.2) {
                b = (cos(x*x)/sin(x*x));
                a = log (abs( b + 2.74));
                System.out.printf("При x/2=%1.2f a=%E\n", x, a);
                System.out.println();
            }
            if ((x/2) < -2 & (x/2) > 0.2 ) {
                System.out.printf("При x/2= вычисления не определены ", x);
            }
        }
    }
    }

