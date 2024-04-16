public class Warrior {
    private String name;
    private int hitDamage;
    private int distance;
    private int armor;

    public Warrior() {
    }
    public Warrior(String name) {
        this.name = name;
    }

    public Warrior(String name, int hitDamage) {
        this(name);
        this.hitDamage = hitDamage;
    }

    public Warrior(String name, int hitDamage, int distance) {
        this(name, hitDamage);
        this.distance = distance;
    }

    public Warrior(String name, int hitDamage, int distance, int armor) {
        this(name, hitDamage, distance);
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitDamage() {
        return hitDamage;
    }

    public void setHitDamage(int hitDamage) {
        this.hitDamage = hitDamage;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
