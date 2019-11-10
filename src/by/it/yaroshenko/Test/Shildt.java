package by.it.yaroshenko.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shildt {

    public static void main(String args[]) {



            Pattern p = Pattern.compile("(якороль).+(\\1)");
            Matcher m = p.matcher("регулярные выражения это круто регулярные выражения это круто регулярные выражения это круто якороль Я СЕГОДНЯ ЕЛ БАНАНЫ якороль регулярные выражения это круто" );
            if(m.find()){
                System.out.println(m.group());
            }


        Pattern pat = Pattern.compile("test");
        Matcher mat = pat.matcher(" test 1 5 7 8   test");

        while (mat.find()) {
            System.out.println("Совпадение найдено по индексу "+mat.start()+mat.group());
        }
        rexep();
    }
    public static void rexep() {

        final String TEXT = "Мне очень нравится Тайланд. Таиланд это то место куда бы я поехал. тайланд - мечты сбываются!";
         System.out.println(TEXT.replaceAll("[Тт]а[ий]ланд", "Украина"));
    }
}
