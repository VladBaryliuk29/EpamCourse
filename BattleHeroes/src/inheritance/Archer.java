package inheritance;

import common.Constants;

public class Archer extends BattleUnit {

    private final String archModel;

    public Archer(String name, String armyType, String archModel) {
        super(name, armyType);
        this.archModel = archModel == null ? Constants.DEFAULT_ARCH : archModel;
    }

    private String getArchModel() {
        return archModel;
    }

    @Override
    public String toString() {
        return super.toString() + " I shoot with a bow !!! " + "My arch model is: " + getArchModel();
    }
}
