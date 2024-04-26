package animal;

public class MainCun extends Cat {

    public MainCun(String catName, String catColor, double jumpsDistance) {
        super(catName, catColor, jumpsDistance);
    }

    @Override
    public void say() {
        System.out.println("Main cun");
    }
}
