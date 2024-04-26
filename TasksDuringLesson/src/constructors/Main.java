package constructors;

import constructors.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer("Geforce rtx 3060", "intel core i5");
        Computer computer3 = new Computer("Geforce rtx 3060", "intel core i5", 3500);
    }
}
