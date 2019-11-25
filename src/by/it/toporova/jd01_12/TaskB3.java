package by.it.toporova.jd01_12;

import java.util.*;

public class TaskB3 {
    //быстрее отработал LinkedList
    // используя интерфейсы очередей.
    // Проверьте свою идею.

    public static void main(String[] args) {
        System.out.println("Введите количество людей: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] peoples = new String[n]; //массив размерностью N для записи имен
        System.out.println("Введите имена людей по одному через Enter: ");
        //scanner = new Scanner(System.in);
        for (int i = 0; i <n; i++) {
            //String name = scanner.nextLine();
            peoples[i] = "name" + (i+1);
        }


        List<String> arr = Arrays.asList(peoples); //формирует список на основе массива. Массив при этом используется для внутреннего представления списка. Таким образом сохраняется связь между списком и исходным массивом (изменения в одном отразятся в другом)
        ArrayList<String> resArray= new ArrayList<>(arr);
        LinkedList<String> resLink = new LinkedList<>(arr);

        Timer t = new Timer();

        String resultArray = process(resArray);
        String resultLink = process(resLink);


        System.out.println("ArrayList " + resultArray + t);
        System.out.println("LinkedList " + resultLink + t);


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


    public static class Timer{
        private  long iniTime;
        private Double Delta;
        Timer()
        {
            iniTime= System.nanoTime();
        }
        public String toString(){
            Delta=(double)(System.nanoTime()-iniTime)/1000;
            iniTime= System.nanoTime();

            return "Прошло "+Delta.toString()+" микросекунд.";
        }

    }

}
