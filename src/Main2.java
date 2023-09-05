import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя размер массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Создаем массив с указанным размером
        int[] numbers = new int[size];

        // Вводим значения элементов массива
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Вычисляем сумму элементов с использованием цикла do-while
        int sumDoWhile = 0;
        int i = 0;
        do {
            sumDoWhile += numbers[i];
            i++;
        } while (i < size);

        // Вычисляем сумму элементов с использованием цикла while
        int sumWhile = 0;
        int j = 0;
        while (j < size) {
            sumWhile += numbers[j];
            j++;
        }

        // Находим максимальный и минимальный элементы
        int max = numbers[0];
        int min = numbers[0];
        for (int k = 1; k < size; k++) {
            if (numbers[k] > max) {
                max = numbers[k];
            }
            if (numbers[k] < min) {
                min = numbers[k];
            }
        }

        // Выводим результаты
        System.out.println("Сумма элементов (do-while): " + sumDoWhile);
        System.out.println("Сумма элементов (while): " + sumWhile);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);

        // Закрываем сканнер
        scanner.close();
    }
}
