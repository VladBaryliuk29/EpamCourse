public class Methods {
    public static void main(String[] args) {
        System.out.println(multiplyTwoNumbers(4, 3));
        printMultiplyThreeNumbers(4, 4, 2);
    }
    public static int multiplyTwoNumbers(int number1, int number2) {
        return number1 * number2;
    }
    public static void printMultiplyThreeNumbers(int number1, int number2, int number3) {
        System.out.println(number1 * number2 * number3);
    }

}
