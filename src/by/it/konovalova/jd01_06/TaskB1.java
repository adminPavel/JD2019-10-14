package by.it.konovalova.jd01_06;

public class TaskB1 {

    public static void main(String[] args) {
        String words = Poem.text;
        words = words.replaceAll("\\n", " ");
        words = words.replaceAll("\\.", "");
        words = words.replaceAll(",", "");
        words = words.replaceAll("!", "");
        words = words.replaceAll("-", "");
        words = words.replaceAll(":", "");
        words = words.replaceAll("  ", " ");
        String[] arr = words.split(" ");

        for (int i = 0; i < arr.length; i++) {
            char res1 = arr[i].charAt(0);
            char res2 = arr[i].charAt(arr[i].length() - 1);
            if ((res2 == 'а' || res2 == 'е' || res2 == 'ё' || res2 == 'и' || res2 == 'о' || res2 == 'у' || res2 == 'ы' || res2 == 'э' || res2 == 'ю' || res2 == 'я') &&
                    (res1 != 'а' || res1 != 'е' || res1 != 'ё' || res1 != 'и' || res1 != 'о' || res1 != 'у' || res1 != 'ы' || res1 != 'э' || res1 != 'ю' || res1 != 'я')&&
                    res1!='И'){
                System.out.println(arr[i]);
            }
        }
    }
}




















