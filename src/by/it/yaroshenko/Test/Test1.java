//package by.it.yaroshenko.Test;
//
//import static java.lang.Math.abs;
//
//public class Test1 {
//
//
//        public static void main(String[] args) {
//
//        }
//        private static void increasingNumbers(int[] massiv, int[] numbers, int chisloNaVhode) {
//            int p;
//            boolean b;
//            for (int i = 0; i < chisloNaVhode; i++) {
//                int k = 0;
//                b = false;
//                int[] array1 = new int[numbers[i]];
//                p = massiv[i];
//                while (p != 0) {
//                    array1[k] = p % 10;
//                    p = p / 10;
//                    if (array1[k] > p % 10) {
//                        b = true;
//                    } else {
//                        b = false;
//                        break;
//                    }
//                    k++;
//                }
//                if (b == true) {
//                    System.out.println("Число, цифры в котором идут в строгом порядке возрастания: " + massiv[i] + ";");
//                    System.out.println();
//                } else {
//                    System.out.println("В " + (i + 1)
//                            + " ячейке массива число, цифры в котором идут в строгом порядке возрастания - не найдено;");
//                    System.out.println();
//                }
//            }
//            System.out.println("--------------------------------");
//        }
//
//
//        private static void NumberWithMinimumNumbers (int[] array) {
//            int a;
//            int digit;
//            int count=0;
//            for (int i = 0; i < array.length; i++) {
//                a=array[i];
//                if (a==0) {
//                    System.out.print(a+" ");
//                    System.out.print("\t");
//                    count++;
//                    continue;
//                }
//                while (abs(a)>0){
//                    digit=abs(a%10);
//                    a=a/10;
//                    System.out.print(digit+" ");
//                    count++;
//
//                }
//
//                System.out.print("\t");
//
//
//            }
//            int[] mas = new int[count];
//            System.out.println("count="+count);
//
//        }
//
//
//
//        private void findValueWithMinSameChars(String[] args)
//        {
//            int[] values = getIntFromString(args);
//            int[] countArray = new int[values.length];
//            int maxValueOfDifferentDigitsIndex = 0;
//            int maxValueOfDifferentDigits = 0;
//
//            for (int i = 0; i < values.length; i++)
//            {
//
//                int count = 0;
//                int[] valueElements = getCharsOfInteger(values[i]);
//                for (int j = 0; j < valueElements.length; j++)
//                {
//
//                    for (int k = j + 1; k < valueElements.length ; k++ )
//                    {
//                        if(valueElements[j] == valueElements[k])
//                        {
//                            count++;
//                        }
//                    }
//                }
//                countArray[i] = count;
//            }
//
//            for (int j = 0; j < countArray.length; j++)// find element with max value
//            {
//
//                if(countArray[j] > maxValueOfDifferentDigits)
//                {
//                    maxValueOfDifferentDigitsIndex = j;
//                    maxValueOfDifferentDigits = countArray[j];
//                }
//            }
//            System.out.println("Value with least Digits Number");
//
//            System.out.println(values[maxValueOfDifferentDigitsIndex]);
//
//        }
//
//
//    }
//
//
//
