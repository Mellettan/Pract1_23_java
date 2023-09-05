import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя размер массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Создаем массив с указанным размером
        int[] numbers = new int[size];

        // Вводим значения элементов массива и считаем сумму
        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        // Вычисляем среднее арифметическое
        double average = (double) sum / size;

        // Выводим результаты
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);

        // Закрываем сканнер
        scanner.close();
    }
}
