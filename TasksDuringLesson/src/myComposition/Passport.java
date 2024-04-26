package myComposition;

public class Passport {
    private String name;
    private String dateOfBirth;


    public Passport(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    @Override
    public String toString() {
        return "{" + "name = " + name + ", dateOfBirth = " + dateOfBirth + '}';
    }
}
