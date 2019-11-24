package by.it.toporova.jd01_12;
//TaskB2.Считалка. В кругу стоят N человек.
//При ведении счета по кругу итератором вычеркивается каждый второй человек,
// пока не останется один.
//Нужно составить два метода,моделирующие процесс и возвращающие
// имя оставшегося человека:static String process(ArrayList<String> peoples)
// static String process(LinkedList<String> peoples)
//Покажите работу методов в main

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class TaskB2 {
    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println("Введите количество людей: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] peoples = new String[n]; //массив размерностью N для записи имен

       // StringBuilder sb = new StringBuilder();
        String names = scanner.nextLine();



    }


}
