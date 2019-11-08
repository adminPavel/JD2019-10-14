package by.it.konovalova.jd01_03;

class InOut {

    /**
     * Метод вводит данные входной строки в массив чисел
     *
     * @param line - входная строка данных
     * @return массив чисел
     */
    static double[] getArray(String line) {
        String[] strArray = line.split(" ");
        double[] array = new double[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Double.parseDouble(strArray[i]);
        }
        return array; //stub

    }

    /**
     * Метод печатает массив
     *
     * @param  - входной массив
     */
    static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * Метод печатает массив в отформатированном виде
     *
     * @param arr - входной массив
     * @param name - имя массива
     * @param columnCount - количество колонок
     */
    static void printArray(double[] arr, String name, int columnCount) {
        for (int i = 0; i < arr.length; i++) {

            System.out.printf("%s[% -3d]=%-6.2f ", name, i, arr[i]);
            if ((i + 1) % columnCount == 0 || i == arr[i]) {
                System.out.println();
            }

        }
    }

}
