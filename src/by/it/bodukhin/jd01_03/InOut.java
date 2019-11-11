package by.it.bodukhin.jd01_03;


 class InOut {
     /**
      *
      * @param line исходный массив String
      * @return Возвращенный массив double
      */
    static double[] getArray(String line) {
        String[] strArray = line.trim().split(" ");
        int sizeArray = strArray.length;
        double[] array=new double[sizeArray];
        for (int i = 0; i < strArray.length; i++) {
            array[i]=Double.parseDouble(strArray[i]);
        }
        return array;
    }

     /**
      *
      * @param arr исходный массив double
      */
    static void printArray(double[ ] arr){
        for (double element : arr) {
            System.out.print(element+" ");
        }
        System.out.println();
    }

     /**
      *
      * @param arr исходный массив double
      * @param name название массива
      * @param columnCount количество колонок для вывода массива
      */
    static void printArray(double[ ] arr, String name, int columnCount){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d]=%-6.2f ",name,i,arr[i]);
            if((i+1)%columnCount==0 || i==arr.length-1) {
                System.out.println();
            }

        }
    }

}

