public class multiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i += 3) {
            write3Columns(i);
            System.out.println();
        }
    }
    public static void write3Columns(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " x " + number + " = " + i * number + "      ");
            System.out.print(i + " x " + (number + 1) + " = " + i * (number + 1) + "      ");
            System.out.println(i + " x " + (number + 2) + " = " + i * (number + 2) + "      ");
        }
    }
}
