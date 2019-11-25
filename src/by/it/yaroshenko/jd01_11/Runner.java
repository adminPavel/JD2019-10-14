package by.it.yaroshenko.jd01_11;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<String> myList = new ListA<>();
        List<String> arrList = new ArrayList<>();

        myList.add("First"); arrList.add("First");
        myList.add("Two"); arrList.add("Two");
        myList.add("Four"); arrList.add("Four");
        System.out.println("mylist"+myList+"\narrList"+arrList);
        myList.add("Tree"); arrList.add("Tree");
        myList.add(0,"Tree"); arrList.add(0,"Tree");
        myList.add(2,"Start"); arrList.add(2,"Start");
        System.out.println("mylist"+myList+"\narrList"+arrList);
        myList.remove("Start"); arrList.remove("Start");
        myList.remove(3); arrList.remove(3);
        System.out.println("mylist"+myList+"\narrList"+arrList);
        System.out.println("mylist(0)"+myList.get(0)+"\narrList"+arrList.get(0));
    }
}
