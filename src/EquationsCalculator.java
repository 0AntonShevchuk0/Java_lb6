// Всі методи статичні, бо клас не зберігає жодних даних
public class EquationsCalculator {
    // Вирішення рівняння 4 степеню
    public static double[] getFourthDegreeEquationRoots(double coef1) throws Exception {
        // Значення під коренем більше 0
        if (coef1 < 0) {
            // Створюємо виключення.
            throw new Exception("There are no roots.");
        }

        // Один корінь
        if (coef1 == 0) {
            return new double[] { 0.0 };
        }
        // Два корені
        else {
            double root = Math.pow(coef1, 0.25);
            return new double[] { root, -root };
        }
    }

    // Вирішення квадратного рівняння
    public static double[] getSquareEquationRoots(double coef1, double coef2, double coef3) throws Exception {
        double decriminant =  Math.pow(coef2, 2.0) - 4.0 * coef1 * coef3;

        // Від'ємний дескримінант
        if (decriminant < 0) {
            throw new Exception("Descriminant < 0");
        }

        // Один корінь
        if (decriminant == 0) {
            return new double[] { getSquareEquationRoot(coef1, coef2, decriminant, 0) };
        }
        // Два корені
        else {
            return new double[] {
                    getSquareEquationRoot(coef1, coef2, decriminant, 1),
                    getSquareEquationRoot(coef1, coef2, decriminant, -1)
            };
        }
    }

    // Вирішення лінійного рівняння
    public static double getLinearEquationRoots(double coef1, double coef2) throws Exception {
        // Випадок 0x = n
        if (coef1 == 0.0 && coef2 != 0.0) {
            throw new Exception("There are no roots.");
        }
        // Випадок 0x = 0
        else if (coef1 == 0.0) {
            throw new Exception("There are an infinite number of roots.");
        }
        // Один корінь
        else {
            return -coef2 / coef1;
        }
    }

    // Розрахунок коренів квадратного рівняння, винесений в окремий метод
    private static double getSquareEquationRoot(double coef1, double coef2, double descriminant, int descriminantCoef) {
        return (-coef2 + descriminantCoef * Math.sqrt(descriminant)) / (2.0 * coef1);
    }
}
