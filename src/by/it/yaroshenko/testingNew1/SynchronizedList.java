package by.it.yaroshenko.testingNew1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class SynchronizedList {
    public static void main(String[] args) {


    List<String> list = Collections.synchronizedList(new ArrayList<String>());
    list.add("1");
    list.add("2");
    list.add("3");
    synchronized (list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
}