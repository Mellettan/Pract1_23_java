import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, факториал которого необходимо найти: ");
        int number = scanner.nextInt();

        long factorial = calculateFactorial(number);

        System.out.println("Факториал числа " + number + " равен " + factorial);
    }

    // Метод для вычисления факториала числа
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определен только для неотрицательных чисел.");
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
