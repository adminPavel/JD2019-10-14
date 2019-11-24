package by.it.toporova.jd01_12;
//TaskB2.Считалка. В кругу стоят N человек.
//При ведении счета по кругу итератором вычеркивается каждый второй человек,
// пока не останется один.
//Нужно составить два метода,моделирующие процесс и возвращающие
// имя оставшегося человека:static String process(ArrayList<String> peoples)
// static String process(LinkedList<String> peoples)
//Покажите работу методов в main

import java.util.*;

public class TaskB2 {


    public static void main(String[] args) {
        System.out.println("Введите количество людей: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] peoples = new String[n]; //массив размерностью N для записи имен
        System.out.println("Введите имена людей по одному через Enter: ");
        scanner = new Scanner(System.in);//почему это работает, а если просто лайном, без объявления нового значения, не работает?
        for (int i = 0; i <n; i++) {
            String name = scanner.nextLine();
            peoples[i] = name;
        }


        List<String> arr = Arrays.asList(peoples); //формирует список на основе массива. Массив при этом используется для внутреннего представления списка. Таким образом сохраняется связь между списком и исходным массивом (изменения в одном отразятся в другом)
        ArrayList<String> resArray= new ArrayList<>(arr);
        LinkedList<String> resLink = new LinkedList<>(arr);

        String resultArray = process(resArray);
        String resultLink = process(resLink);

        System.out.println("ArrayList " + resultArray);
        System.out.println("LinkedList " + resultLink);


    }


    static String process(ArrayList<String> peoples){
        Iterator<String> it = peoples.iterator();
        while (peoples.size()!=1){
            if (!it.hasNext())
                it = peoples.iterator();
            it.next();
            if (!it.hasNext())
                it = peoples.iterator();
            it.next();
            it.remove();
        }
        return peoples.get(0); //т.к остался один
    }


    static String process(LinkedList<String> peoples){
        Iterator<String> it = peoples.iterator();
        while (peoples.size()!=1) {
            if (!it.hasNext())
                it = peoples.iterator();
            it.next();
            if (!it.hasNext())
                it = peoples.iterator();
            it.next();
            it.remove();
        }
        return peoples.get(0);
    }


}
