package by.it.toporova.jd01_04;

import java.util.Arrays;
import java.util.Scanner;

public class TaskC {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scan = sc.nextLine();
        double[] array = buildOneDimArray(scan);

    }


    private static double[] buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        double start = array[0];
        double end = array[array.length - 1];
        //указываем массив и место в массиве для последнего элемента. Длина массива ==10, значит индекс последнего элемента ==9
        InOut.printArray(array, "V", 5);
        double[] arr = mergeSort(array);
        //    System.out.println(Arrays.toString(array));
        InOut.printArray(array, "V", 4);

        int firstIndex = binarySearch(arr, start);
        System.out.println("Index of first element=" + firstIndex);
        int lastIndex = binarySearch(arr, end);
        System.out.println("Index of last element=" + lastIndex);


     /* for (int i = 0; i < array.length; i++) {
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
        }*/
        return array;
    }


    private static double[] mergeSort(double[] array) {
        // если массив пустой, то не нужно никаких действий
        if (array.length <= 1) {
            return array;
        }

        // Создать два массива для первой и второй половины оригинального массива
        //длина первого массива равна длине входящего пополам
        //длина второго - длина входящего минус длина первого.
        double[] first = new double[array.length / 2];
        double[] second = new double[array.length - first.length];
        //Разделить массив пополам и заполнить списки
        // 1 парам - массив-источник. 2 - позиция начала нового массива, 3 - массив-назначения,
        // 4 - начальное положение целевого массива, 5 - кол-во элементов, которые будут скопированы
        System.arraycopy(array, 0, first, 0, first.length);
        System.arraycopy(array, first.length, second, 0, second.length);

        // Рекурсивно отсортировать каждую часть
        mergeSort(first);
        mergeSort(second);

        // Соединить обе половины вместе и перезаписать оригинальный массив
        merge(first, second, array);
        return array;
    }

    private static void merge(double[] first, double[] second, double[] result) {
        // Индекс позиции в первом массиве - старт с первого элемента
        int iFirst = 0;

        // Индекс позиции во втором массиве
        int iSecond = 0;

        // индекс позциции в массиве слияния
        int iMerged = 0;

        // Сравнить индексы первой и второй позиции и переместить меньший элемент в iMerged

        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[iMerged] = first[iFirst];
                iFirst++;
            } else {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        //Разделить массив пополам и заполнить списки
        // 1 парам - массив-источник. 2 - позиция начала нового массива, 3 - массив-назначения,
        // 4 - начальное положение целевого массива, 5 - кол-во элементов, которые будут скопированы
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);

        //System.out.println("вывод результата" + Arrays.toString(result));

    }

    private static int binarySearch(double[] array, double value) {
        //double first = array[0];
        //double last = array[array.length - 1];
        int high = array.length - 1;
        int low = 0;
        int mid = (high + 1) / 2;
        int index = -1;

        while (low <= high) {

            if (array[mid] < value) {
                low = mid + 1;
            } else if (array[mid] == value) {
                index = mid;
                System.out.println("Found");
                break;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            System.out.println("Fail");
        }
        return index;
    }


}






