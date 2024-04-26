package composition;
import common.Constants;

public class SpearWarrior {


    private final String spearModel;
    private final BasicCharacteristics basicCharacteristics;


    public SpearWarrior(String name, String spearModel) {
        this.spearModel = spearModel == null ? Constants.DEFAULT_SPEAR: spearModel;
        this.basicCharacteristics = new BasicCharacteristics(Constants.FOOT, name);
    }

    public String getSpearModel() {
        return spearModel;
    }

    @Override
    public String toString() {
        return basicCharacteristics + " I fight with a spear !!! " + "My spear model is " + getSpearModel();
    }
}
