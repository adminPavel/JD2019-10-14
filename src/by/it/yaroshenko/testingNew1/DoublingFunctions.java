package by.it.yaroshenko.testingNew1;

public class DoublingFunctions {
    public static void main(String[] args) {
        int functionCount = 1;

        while (true) {
            System.out.println("Количество функций: " + functionCount);
            functionCount *= 2; // Удваиваем количество функций
            simulateFunctions(functionCount); // Мы могли бы здесь запустить реальную функцию
            // Здесь можно также добавить условие для прерывания цикла
            // Например: if (functionCount > 1000) { break; }
        }
    }

    // Просто имитация работы функции
    private static void simulateFunctions(int functionCount) {
        for (int i = 0; i < functionCount; i++) {

            // Здесь может быть любая логика для работы функции
            // В данном случае это просто имитация работы
        }
    }
}

