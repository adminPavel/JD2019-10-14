package by.it.toporova.jd01_11;

import java.util.*;

//простите, что Runner похож на помойку
public class Runner {
    public static void main(String[] args) {
        List<String> myList = new ListA<>();
        List<String> arrayList = new ArrayList<>();
        //проверка добавления
        myList.add("First");
        arrayList.add("First");
        myList.add("Second");
        arrayList.add("Second");
        myList.add("Four");
        arrayList.add("Four");
        System.out.println("add myList: " + myList + '\n' + "add arrayList: " + arrayList);

        myList.add(2, "Third");
        arrayList.add(2, "Third");
        myList.add(0, "Start");
        arrayList.add(0, "Start");
        System.out.println("add() myList: " + myList + '\n' + "add()arrayList: " + arrayList);

        //проверка удаления
        myList.remove("First");
        arrayList.remove("First");
        myList.remove(3);
        arrayList.remove(3);
        System.out.println("remove myList: " + myList + '\n' + "remove arrayList: " + arrayList);

        //проверка чтения
        System.out.println("read myList(0): " + myList.get(0) + '\n' + "read arrayList(0): " + arrayList.get(0));


        List<String> myListB = new ListB<>();
        List<String> arrayListB = new ArrayList<>();
        //проверка добавления
        myListB.add("First");
        arrayList.add("First");
        myListB.add("Second");
        arrayList.add("Second");
        myListB.add("Four");
        arrayList.add("Four");
        System.out.println("add myListB: " + myListB + '\n' + "add arrayList: " + arrayList);
        List<String> c = new ArrayList<>();
        c.add("Six");
        c.add("Seven");
        c.add("Nine");
        myListB.addAll(c);
        System.out.println("add myListB: " + myListB + '\n' + "add arrayList: " + arrayList);


        myListB.add(2, "Third");
        arrayList.add(2, "Third");
        myListB.add(0, "Start");
        arrayList.add(0, "Start");
        System.out.println("add() myListB: " + myListB + '\n' + "add()arrayList: " + arrayList);

        //проверка удаления
        myListB.remove("First");
        arrayList.remove("First");
        myListB.remove(3);
        arrayList.remove(3);
        System.out.println("remove myListB: " + myListB + '\n' + "remove arrayList: " + arrayList);


        //проверка чтения
        System.out.println("read myList(0): " + myListB.get(0) + '\n' + "read arrayList(0): " + arrayList.get(0));


        //проверка сета
        Set<String> set = new SetC<>();
        //Set<String> hashSet = new HashSet<>();

       // set.add("two");
        System.out.println("add to set: " + set.add("two"));
        System.out.println("add to set: " + set.add("three"));

        System.out.println("contains: " + set.contains("two"));

        System.out.println("check remove: " + set.remove("two"));
        System.out.println("check isEmpty " + set.isEmpty());
        System.out.println("размер сета: " +  set.size() );
        //проверка работы с коллекцией
        List<String> added = new ArrayList<>();
        added.add("Six");
        added.add("Seven");
        added.add("Nine");
        System.out.println("check addAll: " + set.addAll(added) + added);
        System.out.println("размер сета: " +  set.size() );
        System.out.println("removeAll: " + set.removeAll(added));




    }

}
