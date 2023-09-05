public class Main3 {
    public static void main(String[] args) {
        // Перебираем аргументы командной строки с помощью цикла for
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент #" + (i + 1) + ": " + args[i]);
        }
    }
}
