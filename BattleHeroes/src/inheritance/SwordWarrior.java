package inheritance;

import common.Constants;

public class SwordWarrior extends BattleUnit{
    private final String swordModel;

    public SwordWarrior(String name, String armyType, String swordModel) {
        super(name, armyType);
        this.swordModel = SwordWarrior.this.swordModel == null ? Constants.DEFAULT_SWORD : SwordWarrior.this.swordModel;
    }

    private String getSwordModel() {
        return swordModel;
    }

    @Override
    public String toString() {
        return super.toString() + " I fight with a sword !!! " + "My sword model is: " + getSwordModel();
    }
}
