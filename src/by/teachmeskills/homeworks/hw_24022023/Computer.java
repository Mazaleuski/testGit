package by.teachmeskills.homeworks.hw_24022023;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String processorType;
    private int capacityRAM;
    private int capacityHDD;
    private boolean isAlive;

    public Computer(String processorType, int capacityRAM, int capacityHDD) {
        this.processorType = processorType;
        this.capacityRAM = capacityRAM;
        this.capacityHDD = capacityHDD;
        isAlive = true;
    }

    public void printInfo() {
        System.out.printf("Тип процессора %s, объем оперативной памяти %dgb, " +
                "объем жесткого диска %dgb.\n", processorType, capacityRAM, capacityHDD);
    }

    public void turnOn() {
        if (isAlive) {
            if (checkNums()) {
                System.out.println("Компьютер включился.");
            } else {
                System.out.println("Компьютер сгорел.");
                isAlive = false;
            }
        } else System.out.println("Компьютеру конец.");
    }

    public void turnOff() {
        if (isAlive) {
            if (checkNums()) {
                System.out.println("Компьютер выключился.");
            } else {
                System.out.println("Компьютер сгорел.");
                isAlive = false;
            }
        } else System.out.println("Компьютеру конец.");
    }

    private boolean checkNums() {
        int random = new Random().nextInt(2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 0 или 1.");
        int n = scanner.nextInt();
        return random == n;
    }

    public static void main(String[] args) {
        Computer computer = new Computer("quad-core", 16, 256);
        computer.printInfo();
        computer.turnOn();
        computer.turnOff();
    }
}
