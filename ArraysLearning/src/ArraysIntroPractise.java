import java.util.Arrays;

public class ArraysIntroPractise {
    public static void main(String[] args) {

        int[] array = {1, 4, 8, 10};
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        array = addTenToAllElements(array);
        array = multiplyAllElementsOnFive(array);

        for (int number : array) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println(sum);

        int product = 1;
        for (int number : array) {
            product *= number;
        }
        System.out.println(product);

        int[] arrayTwo = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayTwo[i] = array[i];
        }
        printArrays(array, arrayTwo);

        for (int i = 0; i <= array.length - 1; i++) {
            arrayTwo[i] = array[array.length - 1 - i];
        }
        printArrays(array, arrayTwo);
    }

    public static int[] addTenToAllElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 10;
        }
        return array;
    }

    public static int[] multiplyAllElementsOnFive(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 5;
        }
        return array;
    }

    public static void printArrays(int[] array, int[] arrayTwo) {
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayTwo));
    }
}
