import java.util.Scanner;

// Всі методи статичні, бо клас не зберігає жодних даних
public class ConsoleInputManager {
    // Отримання дробового числа з консолі
    public static double GetDouble(Scanner scanner, String message) {
        System.out.print(message);
        String input = scanner.next();
        return Double.parseDouble(input);
    }
}
