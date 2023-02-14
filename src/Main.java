import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // Початок програми
    public static void main(String[] args) {
        // Створення об'єкту классу для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // Блок, де може виникнути помилка
        try {
            // Введення даних
            double number1 = ConsoleInputManager.GetDouble(scanner, "a: ");
            double number2 = ConsoleInputManager.GetDouble(scanner, "b: ");
            double number3 = ConsoleInputManager.GetDouble(scanner, "c: ");
            double number4 = ConsoleInputManager.GetDouble(scanner, "d: ");
            double number5 = ConsoleInputManager.GetDouble(scanner, "y: ");
            double argument = ConsoleInputManager.GetDouble(scanner, "x: ");

            // Максимальне значення
            System.out.println("MAX (a,b,c,d): " + MyMath.max(number1, number2, number3, number4));
            // 4 степінь
            System.out.println("x^4: " + MyMath.positivePow(argument, 4));
            // Вираз 2-го порядку
            System.out.println("ax^2 + bx + c: " + MyMath.getSecondDegreeExpressionValue(number1, number2, number3, argument));

            // Рівняння 4 степеню
            System.out.println("x^4 - y = 0");
            System.out.println("Roots: " + Arrays.toString(EquationsCalculator.getFourthDegreeEquationRoots(number5)));
            //Квадратне рівняння
            System.out.println("ax^2 + bx + c - y = 0");
            System.out.println("Roots: " + Arrays.toString(EquationsCalculator.getSquareEquationRoots(number1, number2, number3 - number5)));
            // Лінійне рівняння
            System.out.println("ax + c - y = 0");
            System.out.println("Roots: " + EquationsCalculator.getLinearEquationRoots(number1, number3 - number5));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
