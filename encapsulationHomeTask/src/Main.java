public class Main {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior();
        Warrior warrior2 = new Warrior("Geralt");
        Warrior warrior3 = new Warrior("Vitovt", 5);
        Warrior warrior4 = new Warrior("Rem", 4, 5);
        Warrior warrior5 = new Warrior("Vladimir", 4, 6, 3);

        printVar(warrior2, warrior3, warrior4, warrior5);
        warrior2.setName("Lutic");
        warrior3.setHitDamage(6);
        warrior4.setDistance(6);
        warrior5.setArmor(4);
        System.out.println("-----New values-----");
        printVar(warrior2, warrior3, warrior4, warrior5);
    }
    public static void printVar(Warrior warrior1, Warrior warrior2, Warrior warrior3, Warrior warrior4) {
        System.out.println("Name: " + warrior1.getName());
        System.out.println("Hit damage: " + warrior2.getHitDamage());
        System.out.println("Distance: " + warrior3.getDistance());
        System.out.println("Armor: " + warrior4.getArmor());
    }
}