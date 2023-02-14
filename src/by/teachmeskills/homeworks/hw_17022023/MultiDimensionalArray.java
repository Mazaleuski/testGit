package by.teachmeskills.homeworks.hw_17022023;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int n;

        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("Введите значение размера массива:");
            n = scanner.nextInt();
        }

        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt % 2 == 0) {
                    System.out.print("0 ");
                } else System.out.print("1 ");
            }
            System.out.println();
        }
    }
}
