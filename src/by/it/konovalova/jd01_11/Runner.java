package by.it.konovalova.jd01_11;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> list = new ListA<>();
        list.add("IVANOV");
        list.add("PETROV");
        list.add("SIDOROV");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.get(2));


        List<String> listB = new ListB<>();
        listB.add("IVANOV");
        listB.add("PETROV");
        listB.add("SIDOROV");
        System.out.println(listB);
        listB.remove(1);
        System.out.println(listB);
        System.out.println(listB.get(2));
        System.out.println(listB.set(2,"VETROV"));
        listB.add(1,"ANDREEV");
        System.out.println(listB);
    }
}
