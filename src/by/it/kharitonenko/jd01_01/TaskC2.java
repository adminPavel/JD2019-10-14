package by.it.kharitonenko.jd01_01;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int x = y + z;

        System.out.println("DEC:"+y+"+"+z+"="+x);
        System.out.println("BIN:"+Integer.toBinaryString(y)+"+"+Integer.toBinaryString(z)+"="+Integer.toBinaryString(x));
        System.out.println("HEX:"+Integer.toHexString(y)+"+"+Integer.toHexString(z)+"="+Integer.toHexString(x));
        System.out.println("OCT:"+Integer.toOctalString(y)+"+"+Integer.toOctalString(z)+"="+Integer.toOctalString(x));
    }

}
