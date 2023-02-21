package by.teachmeskills.homeworks.hw_24022023;

public class RecursionSumArray {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 8, 9, 1, 2, 9};
        System.out.println(sum(array, array.length));
    }

    static int sum(int[] array, int i) {
        if (i <= 0) return 0;
        return (sum(array, i - 1) + array[i - 1]);
    }
}
