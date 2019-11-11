package by.it.komarov.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яёА-ЯЁ]{4,}");
        Matcher matcher = pattern.matcher(Poem.text);

    }
}
