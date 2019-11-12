package by.it.sermyazhko.jd01_05;

public class TaskB {
    public static void main(String[] args) {
        double a_start = 0;
        double a_end = 2;
        double del = 0.2;
        double x_start = 1;
        double x_end = 6;
        step1(a_start, a_end, del, x_start, x_end);
        double xStart = -6;
        double xEnd = 2;
        double delX = 0.5;
        step2(xStart, xEnd, delX);
    }

    private static void step2(double xStart, double xEnd, double delX) {
        double b = 0;
        double a;

        for (double x = xStart + delX; x < xEnd; x+=0.5) {
            boolean flag = false;
            double xHalf = x/2;
            if(xHalf > -2 && xHalf <= -1){
                b = Math.sin(Math.pow(x,2));
            }
            else if(xHalf > -1 && xHalf < 0.2){
                b = Math.cos(Math.pow(x,2));
            }
            else if(xHalf == 0.2){
                double xPow = Math.pow(x,2);
                b = (Math.cos(xPow))/(Math.sin(xPow));
            }
            else{
                System.out.printf("При x/2 = %5.2f  %s\n", xHalf, "Вычисления не определены");
                flag = true;
            }
            if (!flag) {
                a = Math.log10(Math.abs(b + 2.74));
                System.out.printf("При x/2 = %5.2f  a= %-11.9f\n", xHalf, a);
            }
        }
    }

    private static void step1(double a_start, double a_end, double del, double x_start, double x_end) {
        for (double a = a_start; a <= a_end; a+=del) {
            double y = 0;
            for (double x = x_start; x <= x_end; x++) {
                y = y + (Math.pow(7, a) - Math.cos(x));
            }
            System.out.printf("При a =%-4.2f Сумма y =%g\n", a, y);
        }
        System.out.println();
    }
}
