package by.it.bodukhin.jd01_05;

public class TaskC {
    public static void main(String[] args) {
        step1();
    }

    static void step1() {
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

        System.out.println();
        System.out.println("Массив B[] из элементов массива A > 3.5");
        int j = 0;
        int elements = mas.length;
        for (int i = 0; i < mas.length; i++) {
            boolean del = false;
            for (j = 0; j < elements; j++) {
                if (mas[j] < 3.5) {
                    del = true;
                    break;
                }
            }
            for (int k = j; k < elements - 1; k++) {
                mas[k] = mas[k + 1];
            }
            if(del) {
                elements--;
            }
        }
        for (j = 0; j < elements; j++) {
            System.out.printf("B[ %2d] = %-7.5f    ", j, mas[j]);
            if ((j + 1) % columnCount == 0 || j == elements - 1) {
                System.out.println();
            }

        }
        System.out.println();

        System.out.println("Среднее геометрическое значение");
        double mult=1;
        for (j=0; j<elements; j++) {
            mult=mult*mas[j];
        }
        System.out.println(Math.pow(mult, 1.0/elements));
    }
}


