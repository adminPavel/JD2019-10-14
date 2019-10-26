package by.it.kazak.jd01_03;

public class InOut {
    static double[ ] getArray(String line) {
        String[] strArray = line.trim().split(" ");
        int sizeArray = strArray.length;
        double[] array = new double[sizeArray];
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Double.parseDouble(strArray[i]);
        }
        return array;
    }
    static void printArray(double[ ] arr) {
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    static void printArray(double[ ] arr, String name, int columnCount) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d]=%-8.2f",name,i,arr[i]);
            if ((i+1)%columnCount==0) {
                System.out.println(arr.length);
            }
        }
    }
}
