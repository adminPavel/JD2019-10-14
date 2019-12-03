package by.it.sermyazhko.jd02_01;

import sun.applet.resources.MsgAppletViewer;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

class Helper {

    private static Random generator=new Random(System.nanoTime());

    static int random(int max){
        return random(0,max);
    }

    static int random(int start, int end){
        return start+generator.nextInt(end-start);
    }

    static void sleep(int timeout){
        try {
            Thread.sleep(timeout/Dispatcher.kSpeed);
        } catch (InterruptedException e) {
            System.out.println("Unexpected interrupt");
        }
    }

    static Map.Entry<String,Integer> randomGoods (Map<String,Integer> map){

        /*Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext())
            System.out.println(itr.);*/

       /* for (int i = 0; i < map.size(); i++) {
            T[] ts = map.entrySet().toArray();
        }*/


/*
        Set<String> productName = map.keySet();
        Object[] objects = productName.toArray();
        return objects.;*/

//как вернуть рандомный элемент из словаря
        for (Map.Entry<String,Integer> element : map.entrySet()) {
            return element;
        }
        return null;
    }


}
