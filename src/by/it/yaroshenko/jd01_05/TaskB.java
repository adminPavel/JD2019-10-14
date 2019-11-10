package by.it.yaroshenko.jd01_05;
import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        step1();
        System.out.println();
        step2();

    }
    private static void step2() {
        double x, a, b;
        for (x = -2.75; x < 1; x+=0.25) {
            if(x>-2 && x<=-1) {
            b=sin(4*x*x);
            a=log10(abs(b+2.74));
            System.out.printf("При x/2=%-6.2fa =%f%n", x, a);
            //System.out.println("При x/2="+x+" a = "+a);
            continue;
        } if (x>-1&&x<0.2) {
            b=cos(4*x*x);
            a=log10(abs(b+2.74));
                System.out.printf("При x/2=%-6.2fa =%f%n", x, a);
                //System.out.println("При x/2="+x+" a = "+a);
            continue;
        } if ((2*x)==0.2) {
            b=1.0/(tan(4*x*x));
            a=log10(abs(b+2.74));
                System.out.printf("При x/2=%-6.2fa =%f%n", x, a);
                //System.out.println("При x/2="+x+" a = "+a);
        } else {
            System.out.println("При x/2="+x+" "+"вычисления не определены");
        }

        }
    }

    private static void step1() {
              double a;
        double sum=0;
        for (a = 0; a <=2 ; a+=0.2) {
        for (int x = 1; x <=6 ; x++) {
            double y=pow(7,a)-cos(x);
            sum+=y;
        }System.out.printf("При a=%-6.2fСумма y=%-6.5f%n",a,sum);
      }
    }
}
