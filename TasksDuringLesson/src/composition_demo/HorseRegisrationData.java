package composition_demo;

import java.util.StringJoiner;

public class HorseRegisrationData {
    private String model;
    private String registartionNumber;
    private double weight;

    public HorseRegisrationData(String model, String registartionNumber, double weight) {
        this.model = model;
        this.registartionNumber = registartionNumber;
        this.weight = weight;
    }

    public String model() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String registartionNumber() {
        return registartionNumber;
    }

    public void setRegistartionNumber(String registartionNumber) {
        this.registartionNumber = registartionNumber;
    }

    public double weight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", HorseRegisrationData.class.getSimpleName() + "[", "]")
                .add("model='" + model + "'")
                .add("registartionNumber='" + registartionNumber + "'")
                .add("weight=" + weight)
                .toString();
    }
}
