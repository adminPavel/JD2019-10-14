package by.it.konovalova.jd01_04;

class InOut {

    static double[] getArray(String line) {
        String[] strArray = line.split(" ");
        double[] array = new double[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Double.parseDouble(strArray[i]);
        }
        return array;
    }

    static void printArray(double[] arr, String name, int columnCount) {
        for (int i = 0; i < arr.length; i++) {

            System.out.printf("%s[% -3d]=%-6.2f ", name, i, arr[i]);
            if ((i + 1) % columnCount == 0) {
                System.out.println();
            }
        }
    }
    static void sort(double[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double min = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = min;
                }
            }
        }
    }

}
