package myComposition;

public class Main {
    public static void main(String[] args) {
        Passport passport = new Passport("Vanya Ivanov", "01-04-2002");
        Person person = new Person(passport, "black");
        System.out.println(person);
    }
}
