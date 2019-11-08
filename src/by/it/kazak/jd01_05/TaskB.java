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

    }
}
