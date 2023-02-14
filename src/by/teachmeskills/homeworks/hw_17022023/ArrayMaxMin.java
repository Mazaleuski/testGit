package by.teachmeskills.homeworks.hw_17022023;

import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        double sum = 0;
        double multiplication = 1.0;
        int n;

        System.out.println("Введите размер массива:");
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
        }

        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = Math.random() * 200 - 100;
        }

        for (Double aDouble : array) {
            if (aDouble < 0) sum += aDouble;
        }
        System.out.println("Сумма отрицательных чисел массива = " + sum);

        int indexMax = 0;
        int indexMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexMax]) {
                indexMax = i;
            }
            if (array[i] < array[indexMin]) {
                indexMin = i;
            }
        }

        if (indexMax + 1 == indexMin || indexMin + 1 == indexMax) {
            multiplication = 0;
        } else if (indexMax > indexMin) {
            indexMin++;
            while (indexMin < indexMax) {
                multiplication *= array[indexMin];
                indexMin++;
            }
        } else {
            indexMax++;
            while (indexMax < indexMin) {
                multiplication *= array[indexMax];
                indexMax++;
            }
        }
        System.out.println("Произведение элементов массива между min и max значениями = " + multiplication);
    }
}
