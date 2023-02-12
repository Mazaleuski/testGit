package by.teachmeskills.homeworks.hw_17022023;

import java.util.Scanner;

public class ClosingRectangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение а, b и r:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int r = scanner.nextInt();
        scanner.close();

        if ((r * 2) * (r * 2) >= (a * a) + (b * b)) {
            System.out.println("Можно полностью закрыть.");
        } else System.out.println("Полностью закрыть нельзя.");
    }
}
