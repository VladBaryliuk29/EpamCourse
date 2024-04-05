import java.util.Arrays;

public class ArraysDefaultValuesDemo {
    public static void main(String[] args) {

        String[] stringArray = new String[4];
        int[] integerArray = new int[4];
        double[] dA = new double[4];
        char[] characterArrays = new char[4];
        boolean[] booleanArray = new boolean[4];
        checkValues(stringArray, integerArray, dA, characterArrays, booleanArray);
    }
    public static void checkValues(String[] strings, int[] ints, double[] doubles, char[] chars, boolean[] booleans) {
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(doubles));
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(booleans));
    }
}