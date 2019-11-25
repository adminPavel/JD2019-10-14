package by.it.toporova.jd01_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//TaskA1. Создайте в классе TaskA1 приватное поле -список оценок учеников (с помощью ArrayList).
//Заполните его из метода main случайными оценками(1-10).
//Удалите неудовлетворительные оценки (1-3) из спискас помощью нестатическогометода void clearBad(List<Integer> grades)с итератором.
//Выведите на консоль оба варианта списка (до и после удаления).
public class TaskA1 {
    //поскольку мотот нестатический, нужно будет создать экземпляр класса таска а1
    private List<Integer> list = new ArrayList<>();


    private void clearBad(List<Integer> grades){
        Iterator<Integer> iterator = grades.iterator();//grades.iterator().var....
        while (iterator.hasNext()){
            int grade=iterator.next();
            if(grade<4)
                iterator.remove();
        }
    }

    public static void main(String[] args) {
        TaskA1 task = new TaskA1();//экземпляр задачи такс А1
        for (int i = 0; i < 20; i++) {
            task.list.add(1 + (int) (Math.random() * 10));
        }
        System.out.println(task.list);
        task.clearBad(task.list);
    }



}

