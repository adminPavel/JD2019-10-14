package by.it.kharitonenko.jd01_12;

import java.util.*;

class TaskB2 {
    static String process(ArrayList<String> peoples) {
        ListIterator<String> iterator = peoples.listIterator();
        int counter = 0;
        while (peoples.size() != 1) {
            if (!iterator.hasNext()) {
                iterator = peoples.listIterator();
            }
            iterator.next();
            counter++;
            if (!iterator.hasNext()) {
                iterator = peoples.listIterator();
            }
            if (counter == 1) {
                iterator.next();
                iterator.remove();
                counter = 0;
            }
        }
        return "Остался только " + peoples.get(0);
    }

    static String process(LinkedList<String> peoples) {
        ListIterator<String> iterator = peoples.listIterator();
        int counter = 0;
        while (peoples.size() != 1) {
            if (!iterator.hasNext()) {
                iterator = peoples.listIterator();
            }
            iterator.next();
            counter++;
            if (!iterator.hasNext()) {
                iterator = peoples.listIterator();
            }
            if (counter == 1) {
                iterator.next();
                iterator.remove();
                counter = 0;
            }
        }
        return "Остался только " + peoples.get(0);
    }

    private static String[] createArrayByNumber(int numberOfPeople) {
        String[] result = new String[numberOfPeople];
        for (int i = 0; i < numberOfPeople; i++) {
            result[i] = String.valueOf((int)(Math.random() * 100));
        }
        return result;
    }

    public static void main(String[] args) {
        String[] people = createArrayByNumber(12);
        ArrayList<String> arrayPeople = new ArrayList<>(Arrays.asList(people));
        LinkedList<String> linkedPeople = new LinkedList<>(Arrays.asList(people));
        System.out.println(process(arrayPeople));
        System.out.println(process(linkedPeople));
    }
}
