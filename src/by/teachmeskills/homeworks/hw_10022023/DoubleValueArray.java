package by.teachmeskills.homeworks.hw_10022023;

import java.util.Arrays;

/*      Given an array of integers, return a new array with each value doubled.
        For example:
        [1, 2, 3] --> [2, 4, 6]
*/
public class DoubleValueArray {
    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 4, 5, 6, 7, -12, -55};
        System.out.println(Arrays.toString(map(test)));
    }

    public static int[] map(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }
}
