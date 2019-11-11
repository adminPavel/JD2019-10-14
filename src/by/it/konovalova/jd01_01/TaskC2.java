package by.it.konovalova.jd01_01;

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
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("DEC:" + a + "+" + b + "=" + c);

        String a2 = Integer.toBinaryString(a);
        String b2 = Integer.toBinaryString(b);
        String c2 = Integer.toBinaryString(c);
        System.out.println("BIN:" + a2 + "+" + b2 + "=" + c2);

        String a3 = Integer.toHexString(a);
        String b3 = Integer.toHexString(b);
        String c3 = Integer.toHexString(c);
        System.out.println("HEX:" + a3 + "+" + b3 + "=" + c3);

        String a4 = Integer.toOctalString(a);
        String b4 = Integer.toOctalString(b);
        String c4 = Integer.toOctalString(c);
        System.out.println("OCT:" + a4 + "+" + b4 + "=" + c4);


    }


}
