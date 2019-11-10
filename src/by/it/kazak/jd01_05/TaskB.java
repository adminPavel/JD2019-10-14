package by.it.kazak.jd01_05;

public class TaskB {
    public static void main(String[] args) {
        step1();
        step2();
    }

    private static void step1() {
        double q = 7;
        double y, sum = 0;
        for (double a = 0; a <= 2; a = a + 0.2) {
            for (int i = 0; i <= 6; i++) {
                double f = Math.pow(q, a);
                double b = Math.cos(i);
                sum += f - b;
            }
            System.out.printf("При a=%.2f Сумма y = %g\n", a, sum);
        }
    }

    private static void step2() {
        double x, a, b;
        for (x = -2.75; x < 1; x += 0.25) {
            if (x > -2 && x <= -1) {
                b = Math.sin(4 * x * x);
                a = Math.log10(Math.abs(b + 2.74));
                System.out.printf("При x/2=%-6.2fa =%f%n", x, a);
                continue;
            }
            if (x > -1 && x < 0.2) {
                b = Math.cos(4 * x * x);
                a = Math.log10(Math.abs(b + 2.74));
                System.out.printf("При x/2=%-6.2fa =%f%n", x, a);
                continue;
            }
            if ((2 * x) == 0.2) {
                b = 1.0 / (Math.tan(4 * x * x));
                a = Math.log10(Math.abs(b + 2.74));
                System.out.printf("При x/2=%-6.2fa =%f%n", x, a);
            } else {
                System.out.println("При x/2=" + x + " " + "вычисления не определены");
            }

        }
    }
}
