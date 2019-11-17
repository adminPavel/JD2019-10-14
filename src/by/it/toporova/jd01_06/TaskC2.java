package by.it.toporova.jd01_06;


import java.util.Random;

public class TaskC2 {
//TaskC2. Сформировать и вернуть в методе String slow(String text) из случайных слов
// исходного текста строку String
// минимум в сто тысяч символов путем конкатенации. Слова должны быть «склеены» через один пробел.
// Затем:
//•В методе main: определить время работы метода slow (удобно использовать System.nanoTime()
// или аналог);вывести полученный текст и время работы метода slow в милисекундахна консоль.
//•Ускорить процесс с StringBuilder(сделать новый метод String fast (String text),ВАЖНО:
// его итог должен бытьтаким как в slow до буквы). В main повторить вывод.


    public static void main(String[] args) {

        slow(Poem.text);
    }

    private static void slow(String text) {
        String[] poemsWords = text.split("[ ]+");
        String[] slowWords = new String[100000];
        String slowString = "";
        for (int i = 0; i < 100000; i++) {
            Random random = new Random();
            int low = 0;
            int high = poemsWords.length;
            int result = random.nextInt(high - low) + low;
            // poemsWords[result] = slowWords[i];
            slowString = slowString.concat(poemsWords[result]).concat(" ").concat(slowString);


        }
        System.out.print(slowString);



        //for (int i = 0; i < slowWords.length; i++) {
        //    slowString = slowString.concat(slowWords[i]).concat(" ");
        // }


        // System.out.println("C2 результаты " + slowString);
        //return (String.valueOf( slowString));
        //}


        // static String slow(String text){

        // }


    }
}
