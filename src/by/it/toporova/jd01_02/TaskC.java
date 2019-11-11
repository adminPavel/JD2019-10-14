package by.it.toporova.jd01_02;


import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] mas = step1(n);
        for (int[] ints : mas) {
            System.out.println(Arrays.toString(ints));
            System.out.println();
        }
        int finalSum=step2(mas);
        int[][] ints2;
        ints2 = step3(mas);
        for (int[] intsId : ints2) {
            System.out.println(Arrays.toString(intsId));
        }
    }

    /**
     * Генерация матрицы с заданными пределами n и -n с проверкой обязательного вхождения крайних пределов в матрицу
     *
     * @param n
     * @return
     */
    private static int[][] step1(int n) {
        int[][] twoDimArray = new int[n][n];
        boolean minOk;
        boolean maxOk;
        do {
            maxOk = false;
            minOk = false;
            // Integer rand = ThreadLocalRandom.current().nextInt(-n, n + 1);
            for (int i = 0; i < twoDimArray.length; i++) {
                for (int j = 0; j < twoDimArray.length; j++) {
                    twoDimArray[i][j] = ThreadLocalRandom.current().nextInt(-n, n + 1);
                    if (twoDimArray[i][j] == n) maxOk = true;
                    if (twoDimArray[i][j] == -n) minOk = true;
                }
            }
        } while ((!minOk) || (!maxOk));


        return twoDimArray;
    }

//2.Найти, вывести и вернуть сумму элементов исходной матрицы mas, расположенных между первым и
// вторым положительными элементами каждой строки.Сигнатура int step2(int[ ][ ] mas).


    private static int step2(int[][] mas) {
        int sum = 0;
        int tempSum = 0;
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int i1 = 0; i1 < mas[i].length; i1++) {
                if (count == 1 && (mas[i][i1]<= 0)){
                    tempSum = mas[i][i1] + tempSum;
                }
                if (mas[i][i1]>0){
                   count++;
                }
                if (count == 2){
                    sum = tempSum + sum;
                    break;
                }
            }
            tempSum = 0;
            count = 0;
        }
        System.out.println(sum);
        return sum;
    }





    private static int[][] step3(int[][] mas) {
        int max = Integer.MIN_VALUE; //задаем минимальное значение
        for (int[] ma : mas) {
            for (int j = 0; j < mas.length; j++) {
                if (ma[j] > max) {
                    max = ma[j];
                }
            }
        }

        int rows = mas.length;
        int cols = mas[0].length;
        boolean[] delCol = new boolean[cols];
        boolean[] delRow = new boolean[rows];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[i][j] == max) {
                    delRow[i] = true;
                    delCol[j] = true;
                    System.out.println(i + " " + j + " ");
                }
            }
        }
        for (boolean b : delCol) if (b == true) cols--;
        for (boolean d : delRow) if (d == true) rows--;

        int[][] result = new int[rows][cols];
        int indR = 0;
        for (int i = 0;  i < mas.length; i++) {
            if (!delRow[i]) {
                int jr = 0;
                for (int j = 0; j < mas[i].length; j++) {
                    if (!delCol[j]) {
                        result[indR][jr++] = mas[i][j];
                    }
                }
                indR++;
            }
        }
        return result;

    }


}