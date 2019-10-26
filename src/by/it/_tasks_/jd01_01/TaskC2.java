package by.it.kazak.jd01_01;

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
        System.out.println("DEC:"+(a+"+"+b+"="+(a+b)));
        int f = (a+b);
        String z = Integer.toBinaryString(a);
        String v = Integer.toBinaryString(b);
        String q = Integer.toBinaryString(f);
        System.out.println("BIN:"+(z+"+"+v+"="+q));
        String u = Integer.toHexString(a);
        String i = Integer.toHexString(b);
        String o = Integer.toHexString(f);
        System.out.println("HEX:"+(u+"+"+i+"="+o));
        String g = Integer.toOctalString(a);
        String h = Integer.toOctalString(b);
        String j = Integer.toOctalString(f);
        System.out.println("OCT:"+(g+"+"+h+"="+j));
    }


}
