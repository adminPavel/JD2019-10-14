package by.it.yurtsevich.jd01_01;

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
        int a;
        int b;
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = a + b;
        String dec = Integer.toString(sum);
        String deca = Integer.toString(a);
        String decb = Integer.toString(b);
        String bin = Integer.toBinaryString(sum);
        String bina = Integer.toBinaryString(a);
        String binb = Integer.toBinaryString(b);
        String oct = Integer.toOctalString(sum);
        String octa = Integer.toOctalString(a);
        String octb = Integer.toOctalString(b);
        String hex = Integer.toHexString(sum);
        String hexa = Integer.toHexString(a);
        String hexb = Integer.toHexString(b);
        System.out.println("DEC:" + deca + "+" + decb + "=" + dec);
        System.out.println("BIN:" + bina + "+" + binb + "=" + bin);
        System.out.println("HEX:" + hexa + "+" + hexb + "=" + hex);
        System.out.println("OCT:" + octa + "+" + octb + "=" + oct);

    }

}
