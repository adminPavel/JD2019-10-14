package by.it.sermyazhko.jd01_04;

public class InOut {
    public static double[] getArray(String line) {
        String[] arr = line.trim().split(" ");
        double[] array = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = Double.parseDouble(arr[i]);
        }
        return array;
    }


    public static void printArray(double[] arr) {
        for (double v : arr) {
            System.out.print(v + " ");
        }
    }
    public static void printArray(double[] arr, String name, int columnCount) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-1s[ %d ]=%-8.2f", name, i, arr[i]);
            if((i+1) % columnCount == 0 || i == arr.length - 1){
                System.out.println();
            }
        }
    }
}
