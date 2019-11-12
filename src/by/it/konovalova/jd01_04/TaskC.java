package by.it.konovalova.jd01_04;


import java.util.Scanner;

public class TaskC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        buildOneDimArray(s);
    }

    static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        InOut.printArray(array, "V", 5);
        System.out.println();

        mergeSort(array);
        InOut.printArray(array, "V", 4);
        System.out.println();
    }

    /*  static void mergeSort(double[] arr) {
          int left = 0;
          int right = arr.length - 1;
          for (int i = 0; i < arr.length; i++) {
              if (i < arr.length) {
                  int m = (right - left) / 2;
                  double [] buffL=mergeSort(arr, i, m);
                  mergeSort(arr, m+1, right);
              }

          }
      }

      private static void mergeSort(double[] array, int left, int right) {
          for (int i = 0; i < array.length; i++) {
              if (i < array.length) {
                  int m = (right - left) / 2;
                  mergeSort(array, i, m);
                  mergeSort(array, m+1, right);
                  //merge(mergeSort(array, i, m), mergeSort(array, m, right));
              }

          }


      }

      private static double[] merge(double[] part1, double[] part2) {


      }*/

/////
    /*
    static void mergeSort(double[] arr) {
        int right = arr.length;
        int left = 0;
        int m = (right - left) / 2;
        merge(Arrays.copyOfRange(arr, left, m), Arrays.copyOfRange(arr, m+1, right));
    }

    private static void mergeSort(double[] array, int left, int right) {
        int right1 = array.length;
        int left1 = 0;
        int m1 = (right1 - left1) / 2;
        merge(Arrays.copyOfRange(array, left1, m1), Arrays.copyOfRange(array, m1+1, right1));
    }


    private static double[] merge(double[] part1, double[] part2) {
        int len_1 = part1.length, len_2 = part2.length;
        int a = 0, b = 0, len = len_1 + len_2;
        double[] result = new double[len];
        for (int i = 0; i < len; i++) {
            if (b < len_2 && a < len_1) {
                if (part1[a] > part2[b]) result[i] = part2[b++];
                else result[i] = part1[a++];
            } else if (b < len_2) {
                result[i] = part2[b++];
            } else {
                result[i] = part1[a++];
            }
        }
        return result;
    }

*/
    /////

    /*  static void mergeSort(double[] arr) {
          if (arr == null) {
              double[] arrayB = arr;
          }

          if (arr.length < 2) {
              double[] arrayB = arr;
          }

          double[] arrayB = new double[arr.length / 2];
          System.arraycopy(arr, 0, arrayB, 0, arr.length / 2);


          double[] arrayC = new double[arr.length - arr.length / 2];
          System.arraycopy(arr, arr.length / 2, arrayC, 0, arr.length - arr.length / 2);

          mergeSort(arrayB);
          mergeSort(arrayC);
          mergeArray(arrayB, arrayC);

      }

      public static double[] mergeArray(double[] arrayА, double[] arrayB) {

          double[] arrayC = new double[arrayА.length + arrayB.length];
          int positionA = 0, positionB = 0;

          for (int i = 0; i < arrayC.length; i++) {
              if (positionA == arrayА.length) {
                  arrayC[i] = arrayB[i - positionB];
                  positionB++;
              } else if (positionB == arrayB.length) {
                  arrayC[i] = arrayА[i - positionA];
                  positionA++;
              } else if (arrayА[i - positionA] < arrayB[i - positionB]) {
                  arrayC[i] = arrayА[i - positionA];
                  positionB++;
              } else {
                  arrayC[i] = arrayB[i - positionB];
                  positionA++;
              }
          }
          return arrayC;
      }
      */

    static void mergeSort(double[] a) {
        if (a.length < 2) {
            return;
        }
        int mid = a.length / 2;
        double[] l = new double[mid];
        double[] r = new double[a.length - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < a.length; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, a.length - mid);
        merge(a, l, r, mid, a.length - mid);
    }

    static void mergeSort(double[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        double[] l = new double[mid];
        double[] r = new double[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);
    }

    private static void merge(double[] a, double[] l, double[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static int binarySearch(double[] array, double value) {
        int last = array.length - 1;
        int first = 0;

        while (first <= last) {
            int middle = (first + last) / 2;
            if (array[middle] == value)
                return middle;
            else if (array[middle] < value) {
                first = middle + 1;
                System.out.println("Index of first element=" + first);
            } else {
                last = middle - 1;
                System.out.println("Index of last element=" + last);
            }
        }
        return -1;
    }
}



