package composition_demo;

//  Создать класс Person:  String hairColor;
//  Passport: String dateOfBirth "01-01-200", String name;
//  Композиция - new Person(new Passport());
//  Вывод Person to console

public class Main {
    public static void main(String[] args) {
        HorseRegisrationData regisrationData = new HorseRegisrationData("mustang", "123", 100);
        Horse horse = new Horse(regisrationData);
        System.out.println(horse);
        System.out.println(horse.horseRegisrationData().model() + " eat" );
        horse.setSpeedRun(10);
        System.out.println(horse);

    }
}
