package by.it.komarov.jd01_13;

import java.util.HashMap;

public class TaskA {
    public static void main(String[] args) {
        try {

            if (Math.random() > 0.5)
                new HashMap<String, String>(null);
            else
                Integer.parseInt("привет");
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement element : stackTrace) {
                // проверка если элемент из stackTrace имеет такую же ошибку как и наш класс
                // для этого воспользуемся Reflection API
                // Reflection API - механизм исследования данных во время её выполнения(тёмная сторона Java)
                if (TaskA.class.getName().equals(element.getClassName())) {
                    System.out.println(element);
                    break;
                    // прерываем цикл чтобы не обрабатывались остальные элементы массива
                }
            }
        }
    }
}
