package by.teachmeskills.homeworks.hw_17022023;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = new int[25];
        for (int i = 0; i < 25; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
