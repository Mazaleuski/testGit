package by.teachmeskills.homeworks.hw_17022023;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorClass {

    public static void main(String[] args) {

        double sum = 0;
        double multiplication = 1.0;

        System.out.println("Введите размер вектора:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        Vector<Double> vector = new Vector<>(n);
        for (int i = 0; i < n; i++) {
            vector.add(Math.random() * 200 - 100);
        }

        for (Double aDouble : vector) {
            if (aDouble < 0) sum += aDouble;
        }
        System.out.println("Сумма отрицательных чисел вектора = " + sum);

        int indexMax = vector.indexOf(Collections.max(vector));
        int indexMin = vector.indexOf(Collections.min(vector));
        if (indexMax > indexMin) {
            while (indexMin < indexMax) {
                multiplication *= vector.get(indexMin + 1);
                indexMin++;
            }
        } else {
            while (indexMax < indexMin) {
                multiplication *= vector.get(indexMax + 1);
                indexMax++;
            }
        }
        System.out.println("Произведение элементов вектора между min и max значениями = " + multiplication);
    }
}
