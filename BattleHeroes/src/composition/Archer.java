package composition;

import common.Constants;

public class Archer {
    private final String archModel;

    private final BasicCharacteristics basicCharacteristics;

    public Archer(String name, String archModel) {
        this.archModel = archModel == null ? Constants.DEFAULT_ARCH : archModel;
        this.basicCharacteristics = new BasicCharacteristics(Constants.SHOOTER, name);
    }

    private String getArchModel() {
        return archModel;
    }

    @Override
    public String toString() {
        return basicCharacteristics + " I shoot with a bow !!! " + "My arch model is " + getArchModel();
    }
}
