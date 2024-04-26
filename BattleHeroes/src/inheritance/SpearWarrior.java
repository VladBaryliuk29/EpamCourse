package inheritance;

import common.Constants;

public class SpearWarrior extends BattleUnit{

    private final String spearModel;

    public SpearWarrior(String name, String armyType, String spearModel) {
        super(name, armyType);
        this.spearModel = spearModel == null ? Constants.DEFAULT_SPEAR : spearModel;
    }

    private String getSpearModel() {
        return spearModel;
    }

    @Override
    public String toString() {
        return super.toString() + " I fight with a spear !!! " + "My spear model is: " + getSpearModel();
    }

}
