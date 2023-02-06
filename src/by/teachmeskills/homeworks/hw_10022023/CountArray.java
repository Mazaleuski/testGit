package by.teachmeskills.homeworks.hw_10022023;
import java.util.Arrays;
/*        Given an array of integers.Return an array,where the first element is the count of positives numbers
        and the second element is sum of negative numbers. 0 is neither positive nor negative.
        If the input is an empty array or is null,return an empty array.
*/

public class CountArray {
    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 4, 5, 6, 7, -1, -5, -4};
        System.out.println(Arrays.toString(countPositivesSumNegatives(test)));
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        int countPos = 0;
        int negSum = 0;
        for (int i : input) {
            if (i < 0) {
                negSum += i;
            } else {
                countPos++;
            }
        }
        return new int[]{countPos, negSum}; //return an array with count of positives and sum of negatives
    }
}
