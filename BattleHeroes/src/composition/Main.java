package composition;

import common.Constants;

public class Main {
    public static void main(String[] args) {
        Object[] army = new Object[] {
                new Archer("Anna", Constants.WOOD_ARCH),
                new Archer(null, null),
                new Catapult("John", Constants.BIG_CATAPULT),
                new Catapult(null, null),
                new SwordWarrior("Jimmie", Constants.IRON_SWORD),
                new SwordWarrior(null, null),
                new SpearWarrior("James", Constants.IRON_SPEAR),
                new SpearWarrior(null, null)
        };

        for (Object unit : army) {
            System.out.println(unit);
        }
    }
}
