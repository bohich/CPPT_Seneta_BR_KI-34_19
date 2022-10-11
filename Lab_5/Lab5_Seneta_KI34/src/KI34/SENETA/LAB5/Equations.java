package KI34.SENETA.LAB5;

public class Equations {
    public double calculate(int x) throws CalculationException {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try {
            y = (1.0 / Math.tan(x)) / (Math.sin(2 * rad) + 4 * Math.cos(rad));
            if (y == Double.NaN || y == Double.NEGATIVE_INFINITY ||
                    y == Double.POSITIVE_INFINITY) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException ex) {
            // створимо виключення вищого рівня з поясненням причини
            // виникнення помилки
            if (rad == Math.PI / 2.0 || rad == -Math.PI / 2.0)
                throw new CalculationException("Exception reason: Illegal value of " +
                        "X for tangent calculation");
            else
                throw new CalculationException("Unknown reason of the exception " +
                        "during exception calculation");
        }
        return y;
    }
}
