package by.it.volchek.jd01_05;
import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {

        kz4();
        kz5();
    }
private static void kz4() {


        for (double a = 0;  a<=2 ; a=a+0.2) {
            double y=0;
            for (double x=1; x<7 ; x++) {
                y += Math.pow(7,a) - Math.cos(x);
            }
            System.out.printf("При a=%.2f Сумма y = %f \n",a,y);
        }
}

private static void kz5 (){
        double x, alph;
        double beth = 0;
        String wrng = "вычисления не определены";
    for (x = -5.5; x <2 ; x+=0.5) {
    boolean check = true;
        if (-2<x/2 && x/2<=-1){
            beth=sin(x*x);
        }
         if (-1<x/2 && x/2<0.2){
            beth=cos(x*x);
        }
        if (x/2==0.2){
            beth=1/tan(x*x);
        }
        if (x/2<=-2 ||  x/2>0.2) {
            check = false;
        }
        if (!check){
            System.out.printf("При x/2=%.2f %s \n",x/2,wrng);
        } else {
            alph=log10(abs(beth +2.74));
            System.out.printf("При x/2=%.2f a = %f \n",x/2,alph);
        }
    }

    }
}
