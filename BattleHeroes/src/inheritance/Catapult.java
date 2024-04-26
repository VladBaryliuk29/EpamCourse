package inheritance;

import common.Constants;

public class Catapult extends BattleUnit{

    private final String model;

    public Catapult(String name, String armyType, String model) {
        super(name, armyType);
        this.model = model == null ? Constants.DEFAULT_CATAPULT : model;
    }

    private String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return super.toString() + " I throw stones !!! " + "My model is: " + getModel();
    }
}
