public class Main4 {
    public static void main(String[] args) {
        int n = 10; // Количество чисел в ряде
        double sum = 0.0;

        System.out.println("Первые " + n + " чисел гармонического ряда:");

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
            System.out.printf("1/%d ", i); // Вывод числа с форматированием
        }

        System.out.println("\nСумма первых " + n + " чисел гармонического ряда: " + sum);
    }
}
