package by.it.kharitonenko.jd01_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class TaskA1 {
    private List<Integer> marksList = new ArrayList<>();

    public void clearBad(List<Integer> marksList) {
        Iterator<Integer> iterator = marksList.iterator();
        while (iterator.hasNext()) {
            Integer checkedMark = iterator.next();
            if (checkedMark < 4) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        TaskA1 init = new TaskA1();
        for (int i = 0; i < 15; i++) {
            int mark = 1 + (int) (Math.random() * 10);
            init.marksList.add(mark);
        }
        System.out.println(init.marksList);
        init.clearBad(init.marksList);
        System.out.println(init.marksList);
    }
}
