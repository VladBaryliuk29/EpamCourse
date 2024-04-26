package composition;
import common.Constants;

public class SwordWarrior {


    private final String swordModel;
    private final BasicCharacteristics basicCharacteristics;

    public SwordWarrior(String name, String swordModel) {
        this.swordModel = swordModel == null ? Constants.DEFAULT_SWORD: swordModel;
        this.basicCharacteristics = new BasicCharacteristics(Constants.FOOT, name);
    }

    public String getSwordModel() {
        return swordModel;
    }

    @Override
    public String toString() {
        return basicCharacteristics + " I fight with a sword !!! " + "My sword model is " + getSwordModel();
    }

}
