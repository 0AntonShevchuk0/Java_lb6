// Всі методи статичні, бо клас не зберігає жодних даних
public class MyMath {
    // Максимальне число серед параметрів, число яких змінне
    public static double max(double... numbers) throws Exception {
        // Єдине значення - максимальне
        if (numbers.length == 1) {
            return numbers[0];
        }

        double max = numbers[0];

        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    // Знаходимо число в позитивному степені
    public static double positivePow(double number, int pow) throws Exception {
        // Не рахуємо від'ємні степені
        if (pow < 0) {
            // Генеруємо виключення
            throw new Exception("Negative power.");
        }

        double result = 1.0;
        for (int i = 0; i < pow; i++) {
            result *= number;
        }

        return result;
    }

    // Знаходимо знання многочлену 2-го степеню
    public static double getSecondDegreeExpressionValue(double coef1, double coef2, double coef3, double argument) {
        return coef1 * Math.pow(argument, 2.0) + coef2 * argument + coef3;
    }
}
