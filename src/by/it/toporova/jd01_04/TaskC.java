package by.it.toporova.jd01_04;

import java.util.Arrays;
import java.util.Scanner;

public class TaskC {

    //С1. Повторите полностью в этом классе задание A2(скопируйте в TaskC готовый метод
    // static void buildOneDimArray(String line)и вызовите его из main, но сортировку переделайте
    // (т.е. замените) из пузырьковой в более быструю сортировку слияниемсO-сложностью не выше, чем O(n log n).
    //Метод для сортировки должен находиться в классе TaskCи иметь сигнатуру:static void mergeSort(double[ ] array)
    //Подсказки: удобно предусмотреть также наличие второй копии этого метода для возможности рекурсивного вызова,
    // например, с такой сигнатурой
    //private static void mergeSort(double[ ] array, intleft, intright)
    //метод для слияния двух массивов разработайте самостоятельно, его сигнатура может быть, например, вот такой
    //private static double[ ] merge(double[ ] part1, double[ ] part2)
    //С2. Также при повторе задания A2выполните вычисление новых (после сортировки) индексов первого и
    // последнего элемента исходного массива с помощью собственного алгоритма двоичного (бинарного) поиска,
    // который должен находиться в классе TaskCи иметь сигнатуру:static int binarySearch(double[ ] array, double value)


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scan = sc.nextLine();
        double[] array = buildOneDimArray(scan);

    }


    static double[] buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        double start = array[0];
        double end = array[array.length - 1];//указываем массив и место в массиве для последнего элемента. Длина массива ==10, значит индекс последнего элемента ==9
        InOut.printArray(array, "V", 5);
        mergeSort(array);
        System.out.println(Arrays.toString(array));
        InOut.printArray(array, "V", 4);

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
    }

}


//бинарный поиск первого и последнего


// static int binarySearch(double[ ] array, double value){


// }



