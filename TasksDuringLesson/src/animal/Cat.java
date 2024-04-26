package animal;

public class Cat extends Animal {

    private final double jumpsDistance;

    public Cat(String catName, String catColor, double jumpsDistance) {
        super(catName, catColor);
        this.jumpsDistance = jumpsDistance;
    }

    @Override
    public void say() {
        System.out.println("Mew mew");
    }

    public double jumpsDistance() {
        return jumpsDistance;
    }

    public void jump(){
        System.out.println("I've jumped on distance: " + jumpsDistance);
    }

}
