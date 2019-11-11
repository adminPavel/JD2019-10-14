package by.it.toporova.jd01_01;



/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/


import java.util.Scanner;

class TaskC1 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in); //получение данных с консоли
        int i = scan1.nextInt();                //первая переменная
        int j = scan1.nextInt();                //вторая переменная
     //   int z = i + j;
     //   String s = "Sum = ";
        System.out.println("Sum = " + (i+j));
    }





}
