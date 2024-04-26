package composition_demo;

import java.util.StringJoiner;

public class Horse {

    private HorseRegisrationData horseRegisrationData;

    private int speedRun;

    public Horse(HorseRegisrationData horseRegisrationData) {
        speedRun = 0;
        this.horseRegisrationData = horseRegisrationData;
    }

    public HorseRegisrationData horseRegisrationData() {
        return horseRegisrationData;
    }

    public void setHorseRegisrationData(HorseRegisrationData horseRegisrationData) {
        this.horseRegisrationData = horseRegisrationData;
    }

    public int speedRun() {
        return speedRun;
    }

    public void setSpeedRun(int speedRun) {
        this.speedRun = speedRun;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Horse.class.getSimpleName() + "[", "]")
                .add("horseRegisrationData=" + horseRegisrationData)
                .add("speedRun=" + speedRun)
                .toString();
    }
}


