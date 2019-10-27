package by.it.komarov.jd01_05;

public class TaskB {
    public static void main(String[] args) {
        step1();
        step2();
    }

    private static void step1() {
        double y = 0;
        for (double a = 0; a <=2 ; a+=0.2) {
            for (int x = 1; x <= 6; x++){
                y += (Math.pow(7, a) - Math.cos(x));
            }
            System.out.printf("При a=%3.2f Сумма y = %g\n", a, y);
        }
    }

    private static void step2() {
        double b;
        double a;

        for (double x = -5.50; x < 2; x += 0.5) {
            if (-2 < x / 2 && x / 2 <= -1) {
                b = Math.sin(x * x);
                a = Math.log10(Math.abs(b + 2.74));
                System.out.printf("При x/2=%3.2f a=%g\n", x / 2, a);
            } else if (-1 < x / 2 && x / 2 < 0.2) {
                b = Math.cos(x * x);
                a = Math.log10(Math.abs(b + 2.74));
                System.out.printf("При x/2=%3.2f a=%g\n", x / 2, a);
            } else if (x / 2 == 0.2) {
                b = Math.cos(x * x) / Math.sin(x * x);
                a = Math.log10(Math.abs(b + 2.74));
                System.out.printf("При x/2=%3.2f a=%g\n", x / 2, a);
            } else {
                System.out.printf("При x/2=%3.2f вычисления не определены\n", x / 2);
            }
        }
    }
}
