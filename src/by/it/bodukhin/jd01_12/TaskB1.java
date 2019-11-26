package by.it.bodukhin.jd01_12;

import java.util.*;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> text = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        while (!scanner.nextLine().equals("end")){
            sb.append(scanner.nextLine());
        }

        String[] words = sb.toString().split("[\\n,. \"—;/!)(]+");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("isn't")) {
                text.add("don't");
            } else {
                text.add(words[i]);
            }
        }

        Set<String> oneWord = new HashSet<>(text);

        for (int i = 0; i < oneWord.size(); i++) {
            int freq = Collections.frequency(text,oneWord.toArray()[i]);
            System.out.println(oneWord.toArray()[i] + "=" + freq);
        }
    }
}
