package calculator.composition;

public class StandartCalculator {
    private double numberOne;
    private double numberTwo;

    public double add(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        return this.numberOne + this.numberTwo;
    }

    public double diff(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        return this.numberOne - this.numberTwo;
    }

    public double multy(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        return this.numberOne * this.numberTwo;
    }
    public double div(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        return this.numberOne / this.numberTwo;
    }
}
