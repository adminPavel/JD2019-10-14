package by.it.yaroshenko.jd01_04;
import java.util.Scanner;
public class TaskC {
    public static void main(String[] args) {
       // printMulTable();
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        buildOneDimArray(s);
        double[] array = InOut.getArray(s);
        double first_element=array[0];
        double last_element=array[array.length-1];
        mergeSort(array);
        System.out.println("Index of first element of array ="+binarySearch(array,first_element));
        System.out.println("Last of first element of array ="+binarySearch(array,last_element));


    }

    /**
     * Сортирует массив по возрастанию
     * @param array передаваемый массив для сортировки
     */
    private static void mergeSort(double[] array) {
        int left=0;
        int right = array.length-1;
        if (array.length == 0) {
            return;
        }
        if (left >= right) {
            return;
        }

        // выбрать опорный элемент
        int middle = left + (right - left) / 2;
        double mid = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = left, j = right;
        while (i <= j) {
            while (array[i] < mid) {
                i++;
            }

            while (array[j] > mid) {
                j--;
            }

            if (i <= j) {//меняем местами
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (left < j)
            mergeSort(array, left, j);

        if (right > i)
            mergeSort(array, i, right);
    }
    private static void mergeSort(double[ ] array, int left, int right) {
        if (array.length == 0) {
            return;
        }
        if (left >= right) {
            return;
        }

        // выбрать опорный элемент
        int middle = left + (right - left) / 2;
        double mid = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = left, j = right;
        while (i <= j) {
            while (array[i] < mid) {
                i++;
            }

            while (array[j] > mid) {
                j--;
            }

            if (i <= j) {//меняем местами
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (left < j)
            mergeSort(array, left, j);

        if (right > i)
            mergeSort(array, i, right);
    }

    /**
     * Метод из набранной строки переводит строку в массив double, сортирует массив по возрастанию и выводит
     * индексы первого и последнего элемента в массиве до сортировки
     * @param line строка чисел
     */
    private static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        double first = array[0];
        double last = array[array.length-1];
        InOut.printArray(array, "V", 5);
        mergeSort(array, 0, array.length-1);
        System.out.println("Массив после сортировки -> ");
        InOut.printArray(array, "V", 4);

        for (int i = 0; i < array.length; i++) {
            if(array[i] == first) {
                System.out.println("Index of first element="+i);
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == last) {
                System.out.println("Index of last element="+i);
                break;
            }
        }

    }

    /**
     * Метод находит индекс искомого элемента в массиве
     * @param array отсортированный массив
     * @param elementToSearch элемент в массиве для поиска его номера в массиве
     * @return возвращает индекс искомого элемента
     */
    private static int binarySearch(double[] array, double elementToSearch) {
            int firstIndex =  0 ;
            int lastIndex = array.length-1;

            while (firstIndex <= lastIndex)
            {
                int middleIndex = (firstIndex + lastIndex) /  2 ;
                if (array [middleIndex] == elementToSearch)
                {
                    return middleIndex;
                }
                else  if (array [middleIndex] < elementToSearch)
                {
                    firstIndex = middleIndex +  1 ;
                }
                else  if (array [middleIndex] > elementToSearch)
                {
                    lastIndex = middleIndex -  1 ;
                }
            }

            return -1;
        }

    }

