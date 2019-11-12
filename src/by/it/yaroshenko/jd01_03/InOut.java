package by.it.yaroshenko.jd01_03;

/**
 * @author Pavel Yaroshenko
 * @version 1.1
 */
     class InOut {
    /**
     *
     * @param line - string of numbers
     * @return array received from "String line"
     */
     static double[ ] getArray(String line) {
        String[] strArray = line.trim().split(" "); //создает массив стрингов из line
        int sizeArray = strArray.length; //количество элементов в массиве
        double[] array = new double[sizeArray];
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Double.parseDouble(strArray[i]); // создаем массив типа double
        }

        return array;
    }

    /**
     *
     * @param arr - array to be printed
     */
         static void printArray(double[ ] arr) {
             for (double element : arr) {
                 System.out.print(element+" ");
             }
             System.out.println();
         }

    /**
     *
     * @param arr - array to be printed
     * @param name this is a name of array
     * @param columnCount - amount of columns
     */
          static void printArray(double[ ] arr, String name, int columnCount) {
             for (int i = 0; i < arr.length; i++) {

                 System.out.printf("%s[% -3d]=%-6.2f ",name,i,arr[i]);
                 if ((i+1)%columnCount == 0 || i == arr.length-1) System.out.println();
             }
         }
}
