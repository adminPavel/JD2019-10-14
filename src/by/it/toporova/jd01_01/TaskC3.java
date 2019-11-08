package by.it.toporova.jd01_01;

import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
class TaskC3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double a = getWeight(x);       //объявлена переменная а, результатом которой будет обработка метода getWeight
                                       //с переменой x, введенной с клавиатуры

        System.out.println(a);         // вывод числа в осноном методе, т.к по условию этого нельзя делать в методе
                                        //расчета веса.

        //BigDecimal y = new BigDecimal(x / z * m)--- вариант работы с BigDecimal
        //y.setScale(2, BigDecimal.ROUND_DOWN); ---- округление
    }
        private static double getWeight(int weight) { //метод расчета веса

            double m = 3.86;
            double z = 9.81;
            double y = weight * m / z;

            return Math.round (y * 100.0 )/ 100.0;

    }






  }
