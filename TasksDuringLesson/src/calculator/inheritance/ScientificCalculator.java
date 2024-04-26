package calculator.inheritance;

public class ScientificCalculator extends StandardCalculator {
    private static final double PI_NUMBER = 3.14;
    public double roundArea(double radius) {
        return PI_NUMBER * radius * radius;
    }
}
