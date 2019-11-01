package by.it.komarov.jd01_05;

public class TaskC {
    public static void main(String[] args) {
        double[] arrayA = new double[30];

        setArrayA(arrayA);
        getArray(arrayA, "A");
        getArray(setArrayB(arrayA), "B");

    }

    private static void setArrayA(double[] arrayA){
        int indexA = -1;
        for (double x = 5.33; x <= 9.0 ; x += 0.15) {
            indexA++;
            arrayA[indexA] = Math.pow((x * x) + 4.5, 1.0 / 3.0);
        }
    }

    private static double[] setArrayB(double[] arrayA){
        double[] arraySecond = new double[30];
        int indexArray = 0;
        for (double element : arrayA) {
            if (element > 3.5) {
                arraySecond[indexArray++] = element;
            }
        }
        return arraySecond;
    }

    private static void getArray(double[] array, String name){
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                if (i % 5 == 0) {
                    System.out.println();
                }
                System.out.printf("%s[%2d]=%3.6f  ", name,  i, array[i]);
            }
        }
        System.out.println();
    }
}
