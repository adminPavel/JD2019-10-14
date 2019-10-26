package by.it.yaroshenko.jd01_01;

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


    Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("DEC:"+a+"+"+b+"="+(a+b)); // десятичная

        String bin1_str = Integer.toBinaryString(a);
        String bin2_str = Integer.toBinaryString(b);
        String bin3_str = Integer.toBinaryString(a+b);
        System.out.println("BIN:"+bin1_str+"+"+bin2_str+"="+(bin3_str)); // Двоичная

        String hex1_str = Integer.toHexString(a);
        String hex2_str = Integer.toHexString(b);
        String hex3_str = Integer.toHexString(a+b);
        System.out.println("HEX:"+hex1_str+"+"+hex2_str+"="+(hex3_str)); // Шестнадцатиричная

        String oct1_str = Integer.toOctalString(a);
        String oct2_str = Integer.toOctalString(b);
        String oct3_str = Integer.toOctalString(a+b);
        System.out.println("OCT:"+oct1_str+"+"+oct2_str+"="+(oct3_str)); // Восьмеричная
    }
}
