package by.it.yaroshenko.testing;

import java.util.Date;

public class data {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("%tT%n", date);
        System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n", date);
        //Здесь мы хотим получить на выходе текущее время, am/pm, время в миллисекундах и
        // наносекундах, а также смещение часового пояса:
        System.out.printf("%1$tA, %1$tB %1$tY %n", date);
        System.out.printf("%1$td.%1$tm.%1$ty %n", date);
    }
}
