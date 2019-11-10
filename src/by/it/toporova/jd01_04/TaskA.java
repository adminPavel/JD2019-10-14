package by.it.toporova.jd01_04;



import java.util.Scanner;

public class TaskA {
    public static void main(String[] args){
        printMulTable();
        Scanner sc = new Scanner(System.in);
        String scan = sc.nextLine();
        buildOneDimArray(scan);

    }


    static void printMulTable() {
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%1d*%1d=%-3d", i, j, i * j);

            }
            System.out.println();
        }
    }


    static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        double start = array[0];
        double end = array[array.length-1];//указываем массив и место в массиве для последнего элемента. Длина массива ==10, значит индекс последнего элемента ==9
        InOut.printArray(array, "V", 5);
        Helper.sort(array);
        InOut.printArray(array, "V", 4);

        //System.out.println("Index of first element=" + Arrays.binarySearch(array, start));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == start) { //значение элемента с координатами i д.б равно заданному стартовому
                System.out.println("Index of first element=" + i);

                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == end) {
                System.out.println("Index of last element=" + i);
                break;
            }
        }




    }
}