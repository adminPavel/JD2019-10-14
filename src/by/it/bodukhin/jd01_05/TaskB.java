package by.it.bodukhin.jd01_05;
import static java.lang.Math.*;
public class TaskB {
    public static void main(String[] args) {
        step1();
        System.out.println();
        step2();
    }

    static void step1() {
        for (double a = 0; a <= 2; a = a + 0.2) {
            double sum = 0;
            for (int x = 1; x <= 6; x++) {
                double y = pow(7, a) - cos(x);
                sum = sum + y;
            }
            System.out.printf("При а=%4.2f Сумма y =%10f\n", a, sum);
        }
    }

    static void step2() {
        for (double x = -5.5; x < 2; x = x + 0.5) {
            double b=0;
            double a=0;
            double xt = x / 2;
            if (-2 < xt && xt <= -1) {
                b = sin(pow(x, 2));
                a = log(abs(b+2.74));
                System.out.printf("При x/2=%4.2f a = %8e\n", xt, a);
            }
            else if (-1 < xt && xt < 0.2) {
                b = cos(pow(x, 2));
                a = log(abs(b+2.74));
                System.out.printf("При x/2=%4.2f a = %8e\n", xt, a);
            }
            else if(xt==0.2){
                b = 1/tan(pow(x,2));
                a = log(abs(b+2.74));
                System.out.printf("При x/2=%4.2f a = %8e\n", xt, a);
            }
            else {
                System.out.printf("При x/2=%4.2f вычисления не определены\n", xt);
            }
        }
    }
}