package myComposition;

public class Person {

    private Passport passport;
    private String hairColor;

    public Person(Passport passport, String hairColor) {
        this.passport = passport;
        this.hairColor = hairColor;
    }


    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    @Override
    public String toString() {
        return "Person = " + passport +
                ", hairColor = " + hairColor +
                '}';
    }
}
