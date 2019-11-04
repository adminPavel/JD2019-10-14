package by.it.bodukhin.jd01_05;

import java.util.Arrays;

public class TaskC {
    public static void main(String[] args) {
        double[] mas = fillmas();
        double[] masless = Arrays.copyOfRange(mas, 0 , mas.length);
        less(masless);
        mathavg(masless);
    }

    static double[] fillmas() {
        int minMas = 20;
        int maxMas = 40;
        double minX = 5.33;
        double maxX = 9;

        maxMas -= minMas;
        int n = (int) (Math.random() * (maxMas + 1) + minMas);
        double[] mas = new double[n];
        int columnCount = 5;
        maxX -= minX;
        System.out.println("Массив A[]");
        for (int i = 0; i < mas.length; i++) {
            double x = Math.rint((Math.random() * (maxX + 0.000001) + minX)
                    * 100000) / 100000;
            mas[i] = Math.cbrt(Math.pow(x, 2) + 4.5);
            System.out.printf("A[ %2d] = %-7.5f    ", i, mas[i]);
            if ((i + 1) % columnCount == 0 || i == mas.length - 1) {
                System.out.println();
            }
        }
        return mas;
    }
    static double[] less(double[] masless) {
        System.out.println();
        System.out.println("Массив B[] из элементов массива A > 3.5");
        int columnCount = 5;
        int j = 0;
        int elements = masless.length;
        //double[] masless = Arrays.copyOfRange(mas,0, mas.length-1);
        for (int i = 0; i < masless.length; i++) {
            boolean del = false;
            for (j = 0; j < elements; j++) {
                if (masless[j] < 3.5) {
                    del = true;
                    break;
                }
            }
            for (int k = j; k < elements - 1; k++) {
                masless[k] = masless[k + 1];
            }
            if (del) {
                elements--;
            }
        }
        for (j = 0; j < elements; j++) {
            System.out.printf("B[ %2d] = %-7.5f    ", j, masless[j]);
            if ((j + 1) % columnCount == 0 || j == elements - 1) {
                System.out.println();
            }
        }
        System.out.println();
        return masless;
    }
    static double mathavg(double[] masless) {
        System.out.println("Среднее геометрическое значение");
        double mult=1;
        for (int j=0; j<masless.length; j++) {
            mult=mult*masless[j];
        }
        System.out.println(Math.pow(mult, 1.0/masless.length));
        return mult;
    }
}


