package by.it.kharitonenko.jd01_05;

public class TaskC {
    public static void main(String[] args) {

    }

    //генерация случайного числа от 20 до 40 + создание массива
    static double[] createArrayC1() {
        int numberOfElements;
        do {
            numberOfElements = (int) (Math.random() * 10 * 4 + 1);
        }
        while (numberOfElements < 20 || numberOfElements > 40);

        System.out.println(numberOfElements);
        return new double[numberOfElements];
    }

}
