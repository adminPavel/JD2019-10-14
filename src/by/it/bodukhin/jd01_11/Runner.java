package by.it.bodukhin.jd01_11;

import java.util.List;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {

        List<String> myList = new ListA<>();
        Set<String> mySet = new SetC<>();
        mySet.add("1");
        mySet.add("2");
        mySet.add("3");
        System.out.println(mySet);
        mySet.remove("2");
        System.out.println(mySet);


    }
}