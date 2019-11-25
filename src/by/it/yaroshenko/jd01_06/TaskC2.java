package by.it.yaroshenko.jd01_06;

import java.util.Random;
public class TaskC2 {

    public static void main(String[] args) {
        long timestart=System.currentTimeMillis();
        System.out.println(slow(Poem.text));
        long timesend=System.currentTimeMillis();
        System.out.println(timesend-timestart);

        long timestart_fast=System.currentTimeMillis();
        System.out.println(fast(Poem.text));
        long timesend_fast=System.currentTimeMillis();
        System.out.println(timesend_fast-timestart_fast);
    }
    /**
     *Метод формирует String из случайных слов размером более 100тыс символов
     */
    private static String slow(String text) {
        String[] words = text.split("[^а-яA-ЯёЁ]+");
        String res="";
        Random random=new Random(11);
        while (res.length()<100_000)
            res=res.concat(words[random.nextInt(words.length)]+" ");
        return res;
    }

   private static String fast(String text) {
       StringBuilder sb = new StringBuilder();
       String[] words = text.split("[^а-яA-ЯёЁ]+");
       Random random=new Random(11);
       while (sb.length()<100_000)
           sb.append(words[random.nextInt(words.length)]).append(" ");
       return sb.toString();   }
}
