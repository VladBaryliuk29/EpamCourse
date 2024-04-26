package calculator.composition;

public class Main {
    public static void main(String[] args) {


        StandartCalculator standartCalculator = new StandartCalculator();
        ScientificCalculator scientificCalculator = new ScientificCalculator(standartCalculator);


        System.out.println(standartCalculator.add(2, 2));
        System.out.println(scientificCalculator.add(3,3));
        System.out.println(scientificCalculator.roundArea(2));
    }
}
