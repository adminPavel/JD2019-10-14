package by.it.yaroshenko.jd01_02;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();
        step2(mon);
        step1();

        Scanner scanner_step3 = new Scanner(System.in);
        double a = scanner_step3.nextDouble();
        double b = scanner_step3.nextDouble();
        double c = scanner_step3.nextDouble();

       step3(a, b, c);
    }



    private static void step1() {

        int [][] array = new int [5][5];
        int a = 0;
        for (int i=0; i<array.length;i++) {
            for (int j=0; j <array[i].length;j++) {
                a++;
                System.out.print(a + " ");
            }
            System.out.println();
        }




    }
    private static void step2 (int month) {

        switch (month) {
            case  (1):
                System.out.println("январь");
                break;
            case (2):
                System.out.println("февраль");
                break;
            case (3):
                System.out.println("март");
                break;
            case (4):
                System.out.println("апрель");
                break;
            case (5):
                System.out.println("май");
                break;
            case (6):
                System.out.println("июнь");
                break;
            case (7):
                System.out.println("июль");
                break;
            case (8):
                System.out.println("август");
                break;
            case (9):
                System.out.println("сентябрь");
                break;
            case (10):
                System.out.println("октябрь");
                break;
            case (11):
                System.out.println("ноябрь");
                break;
            case (12):
                System.out.println("декабрь");
                break;
            default:
                System.out.println("нет такого месяца");
                break;

        }


    }
    private static void step3 (double a, double b, double c) {

        double discriminant = b*b - 4*a*c; //Вычислить значение дискриминанта
        if (discriminant>0) {
            double x1 = (-b - Math.sqrt(discriminant))/(2*a);
            double x2 = (-b + Math.sqrt(discriminant))/2*a;

            System.out.println(x1 +x2); //"Корней два: " + "x1 = " +  " ,x2 = " +
        }
        if (discriminant == 0) {
            double x1 = -b/(2*a);
            System.out.println(x1); //"Один корень: " + "x1 = " +
        }

        if (discriminant<0) {
            System.out.println("корней нет");
        }


    }

}
