package by.it.komarov.jd01_05;

public class TaskC {
    public static void main(String[] args) {
        step1();
    }
    private static void step1() {
        double[] arrayA = new double[40];
        double[] arrayB = new double[40];
        int indexA = -1;
        int indexB = -1;

        for (double x = 5.33; x <= 9.0 ; x += 0.15) {
            indexA++;
            arrayA[indexA] = Math.pow((x*x) + 4.5, 1.0/3.0);
            System.out.printf("A[%3d]=%4.6f ", indexA, arrayA[indexA]);
            if (indexA % 5 == 0)
                System.out.println();
            if (arrayA[indexA] > 3.5){
                indexB++;
                arrayB[indexB] = arrayA[indexA];
                }
            }
        System.out.println();

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] > 3.5){
                arrayB[i] = arrayA[i];
            }
            if (arrayB[i] == 0){
                continue;
            }else
                System.out.printf("B[%3d]=%4.6f ", i, arrayB[i]);
            if (i % 5 == 0){
                System.out.println();
            }
        }
    }
}
