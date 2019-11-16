package by.it.yaroshenko.jd01_06;

public class TaskB2 {
    public static void main(String[] args) {
        String text = Poem.text.replaceAll( "[^а-яА-ЯёЁ.!]+", " "); //Уточнить как следующее выражение "[\\.]{2,}" объединить с регулярном выражении
        text = text.replaceAll("[.]{2,}","");
        String[] sentence = text.split("[.!]");
        for (int i = 0; i < sentence.length; i++) {
        sentence[i]=sentence[i].trim();
        }

        boolean isSorted = false;
        String buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < sentence.length-1; i++) {
                if(sentence[i].length() > sentence[i+1].length()){
                    isSorted = false;

                    buf = sentence[i];
                    sentence[i] = sentence[i+1];
                    sentence[i+1] = buf;
                }
            }
        }
        for (String s : sentence) {
                System.out.println(s);
        }
    }
}
