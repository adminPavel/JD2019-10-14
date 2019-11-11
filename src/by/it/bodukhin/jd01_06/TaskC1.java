package by.it.bodukhin.jd01_06;


public class TaskC1 {
    public static void main(String[] args) {
        String[] line = Poem.text.split("\n");
        int maximum = lengthMax(line); //максимальная длинна строки
        isEqualLength(line, maximum);
    }

    private static int lengthMax(String[] line) {
        int max = line[0].length();
        for (String s : line) {
            if (max < s.length()) {
                max = s.length();
            }
        }
        return max;
    }

    private static void isEqualLength(String[] line, int maximum) {
        for (int i = 0; i < line.length; i++) { //перебираем строки
            if (line[i].length() < maximum) {
                int count = maximum - line[i].length(); //кол-во недостающих до максимума символов
                String[] words = line[i].split("[ ]"); //закидываем в массив все слова из строки

                for (int j = 0; j < words.length - 1; j++) { //возращаем удаленные пробелы
                    words[j] = words[j].concat(" ");
                }

                int k = 0; //счетчик

                do {
                    for (int j = 0; j < words.length - 1; j++) { //новые слова с добавлением пробелов
                        words[j] = words[j].concat(" ");
                        k++;
                        if(k==count) break;
                    }
                } while (k!=count);

                line[i] = ""; //очищаем строку

                for (String word : words) { //заполняем строку новыми словами
                    line[i] = line[i].concat(word);
                }
                System.out.println(line[i]);
            } else System.out.println(line[i]);
        }
    }
}
