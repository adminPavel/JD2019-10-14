package by.it.yaroshenko.lesson.lesson2;

import java.lang.reflect.Array;
import java.util.*;
/*
Даны интервальные события events
реализуйте метод calcStartTimes, так, чтобы число принятых к выполнению
непересекающихся событий было максимально.
Алгоритм жадный. Для реализации обдумайте надежный шаг.
*/

public class B_Sheduler {
    //событие у аудитории(два поля: начало и конец)
    static class Event {
        int start;
        int stop;

        Event(int start, int stop) {
            this.start = start;
            this.stop = stop;
        }

        public  int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getStop() {
            return stop;
        }

        public void setStop(int stop) {
            this.stop = stop;
        }

        @Override
        public String toString() {
            return "("+ start +":" + stop + ")";
        }
    }

    public static void main(String[] args) {
        B_Sheduler instance = new B_Sheduler();
        // B_Sheduler.Event be = new B_Sheduler.Event();



        Event[] events =
             {  new Event(0, 3),  new Event(0, 1), new Event(1, 2), new Event(3, 5),
                new Event(1, 3),  new Event(1, 3), new Event(1, 3), new Event(3, 6),
                new Event(2, 7),  new Event(2, 3), new Event(2, 7), new Event(7, 9),
                new Event(3, 5),  new Event(2, 4), new Event(2, 3), new Event(3, 7),
                new Event(4, 5),  new Event(6, 7), new Event(6, 9), new Event(7, 9),
                new Event(8, 9),  new Event(4, 6), new Event(8, 10), new Event(7, 10)
        };

        //Map<Integer, Integer> hashMap = new TreeMap<>();

        List<Event> starts = instance.calcStartTimes(events,0,10);  //рассчитаем оптимальное заполнение аудитории
        System.out.println(starts);                                 //покажем рассчитанный график занятий
    }



    List<Event> calcStartTimes(Event[] events, int from, int to) {
        //Events - события которые нужно распределить в аудитории
        //в период [from, int] (включительно).
        //оптимизация проводится по наибольшему числу непересекающихся событий.
        //Начало и конец событий могут совпадать.
        List<Event> result;
        result = new ArrayList<>();


       // Arrays.sort(events);
       // Arrays.sort(events, Comparator.comparing(Event::getStart));
        Arrays.sort(events, Comparator.comparingInt(x -> x.stop));

//        for (int i = 0; i < events.length; i++) {
//            result.add(events[i]);
//            //Event event = events[i];
//
//            // event.start;
//        }

  //      List<Event> eventList = Arrays.stream(events).filter(event -> event.start >= from && event.stop <= to).sorted(Comparator.comparingInt(event -> event.stop)).toList();
//        result.add(eventList.get(0));
//        for (int i = 1; i < eventList.size(); i++) {
//            if (eventList.get(i).start < result.get(result.size() - 1).stop) continue;
//            result.add(eventList.get(i));
//        }


       // int prevEnd = from;
        for (int i = 0; i < events.length; i++) {
            Event event = events[i];
            if (event.start >= from && event.stop <= to) {
                result.add(event); //добавляем events[i] в лист
                from = event.stop; //начинаем from с последнего добавленного events[i] заканчивающегося на stop
            }
        }




//        for (int i = 1; i < eventList.size(); i++) {
//            if (eventList.get(i).start < result.get(result.size() - 1).stop) continue;
//            result.add(eventList.get(i));
//        }

        //Collections.sort(events);
//        for (int i = 0; i < result.size(); i++) {
//            System.out.println(result.get(i));
//        }
//        System.out.println();
//            result.sort(new Comparator<Event>() {
//                @Override
//                public int compare(Event o1, Event o2) {
//                    return 0;
//                }
//            });
        //ваше решение.
             return result;          //вернем итог
    }
}