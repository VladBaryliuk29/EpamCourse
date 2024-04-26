package calculator.inheritance;


public class Main {
    public static void main(String[] args) {
        StandardCalculator standardCalculator = new ScientificCalculator();
        standardCalculator.diff(1, 1);


        ScientificCalculator scientificCalculator = new ScientificCalculator();
        scientificCalculator.diff(2,3);

        DateCalculator dateCalculator = new DateCalculator();

    }
}
