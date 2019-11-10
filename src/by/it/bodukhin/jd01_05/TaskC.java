package by.it.bodukhin.jd01_05;

import java.util.Arrays;

public class TaskC {
    public static void main(String[] args) {
        double[] mas = fillmas();
        double[] masless = Arrays.copyOfRange(mas, 0 , mas.length);
        findless(masless);
        findavg(masless);

        double[] masA = new double[31];
        fillmasA(masA);
        findlessA(masA);
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

    static double[] fillmasA(double[] masA) {
        int minX = 103;
        int maxX = 450;

        int columnCount = 5;
        maxX -= minX;
        System.out.println("Массив A[31]");
        for (int i = 0; i < masA.length; i++) {
            masA[i] = Math.round(Math.random() * (maxX + 1) + minX);
            System.out.printf("A[%2d] = %-7.0f    ", i, masA[i]);
            if ((i + 1) % columnCount == 0 || i == masA.length - 1) {
                System.out.println();
            }
        }
        return masA;
    }

    static double[] findless(double[] masless) {
        System.out.println();
        System.out.println("Массив B[] из элементов массива A > 3.5");
        int columnCount = 5;
        int j = 0;
        int elements = masless.length;

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

    static double[] findlessA(double[] masA) {
        System.out.println();
        System.out.println("Массив B[] из элементов массива A * 0.1 > i");
        int columnCount = 5;
        int elements = masA.length;
        int j = 0;

        for (int i = 0; i < masA.length; i++) {
            boolean del = false;
            double indexA = masA[i] * 0.1;
            if(indexA < i) {
                del = true;
            }
            if (del) {
                elements--;
            }
        }

        double[] maslessB = new double[elements];
        for (int i = 0; i < masA.length; i++) {
            double indexA = masA[i] * 0.1;
            if(indexA > i) {
                maslessB[j] = masA[i];
                j++;
            }
        }

        Arrays.sort(maslessB);

        for (int i = 0; i < elements; i++) {
            //System.out.print("―――――――");
            System.out.printf("|B[%2d] = %-3.0f|", i, maslessB[i]);
            if ((i + 1) % columnCount == 0 || i == elements - 1) {
                System.out.println();
            }
        }
        System.out.println();
        return maslessB;
    }

    static double findavg(double[] masless) {
        System.out.println("Среднее геометрическое значение");
        double mult=1;
        for (int j=0; j<masless.length; j++) {
            mult=mult*masless[j];
        }
        System.out.println(Math.pow(mult, 1.0/masless.length));
        System.out.println();
        return mult;
    }
}


