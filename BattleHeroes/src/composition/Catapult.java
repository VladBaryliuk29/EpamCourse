package composition;

import common.Constants;

public class Catapult {


    private final String model;
    private final BasicCharacteristics basicCharacteristics;

    public Catapult(String name, String model) {
        this.model = model == null ? Constants.DEFAULT_CATAPULT: model;
        this.basicCharacteristics = new BasicCharacteristics(Constants.ARTILLERY, name);
    }

    private String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return basicCharacteristics + " I throw stones !!! " + "My model is " + getModel();
    }
}
