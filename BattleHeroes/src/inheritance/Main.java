package inheritance;

import common.Constants;


public class Main {
    public static void main(String[] args) {
        BattleUnit [] army = new BattleUnit[] {
                new Archer("Anna", Constants.SHOOTER, Constants.WOOD_ARCH),
                new Archer(null, null, null),
                new Catapult("John", Constants.ARTILLERY, Constants.BIG_CATAPULT),
                new Catapult(null, null, null),
                new SwordWarrior("Jimmie", Constants.FOOT,Constants.IRON_SWORD),
                new SwordWarrior(null, null, null),
                new SpearWarrior("James", Constants.FOOT, Constants.IRON_SPEAR),
                new SpearWarrior(null, null, null)
        };

        for (BattleUnit battleUnit : army) {
            System.out.println(battleUnit);
        }
    }
}
