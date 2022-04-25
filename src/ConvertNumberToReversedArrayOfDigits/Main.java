package ConvertNumberToReversedArrayOfDigits;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Kata.digitize(35231L))); //expects [1, 3, 2, 5, 3]
        System.out.println(Arrays.toString(Kata.digitize(0L)));  //expects [0]
    }
}
