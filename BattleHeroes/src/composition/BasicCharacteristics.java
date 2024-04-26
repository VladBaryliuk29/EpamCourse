package composition;

import common.Constants;

public class BasicCharacteristics {
    private final String name;
    private final String armyType;

    public BasicCharacteristics(String armyType, String name) {
        this.name = name == null ? Constants.NO_NAME : name;
        this.armyType = armyType == null ? Constants.DEFAULT_TYPE : armyType;
    }

    private String getMyType() {
        return armyType;
    }

    private String getMyName() {
        return name;
    }

    @Override
    public String toString() {
        return "My type is " + getMyType() + " and my name is " + getMyName();
    }

}

