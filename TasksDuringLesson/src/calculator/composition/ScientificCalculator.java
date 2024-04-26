package calculator.composition;

public class ScientificCalculator {
    private static final double PI_NUMBER = 3.14;
    private final StandartCalculator standartCalculator;

    public ScientificCalculator(StandartCalculator standartCalculator) {
        this.standartCalculator = standartCalculator;
    }

    public double roundArea(double radius) {
        return PI_NUMBER * radius * radius;
    }

    public double add(double numberOne, double numberTwo) {
        return standartCalculator.add(numberOne, numberTwo);
    }

    public double diff(double numberOne, double numberTwo) {
        return standartCalculator.diff(numberOne, numberTwo);
    }

    public double multy(double numberOne, double numberTwo) {
        return standartCalculator.multy(numberOne, numberTwo);
    }
    public double div(double numberOne, double numberTwo) {
        return standartCalculator.div(numberOne, numberTwo);
    }

}
