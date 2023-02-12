package by.teachmeskills.homeworks.hw_17022023;

public class SwitchDays {

    public static void main(String[] args) {

        int n = 2;
        switch (n) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Нет такого дня недели");
        }
    }
}

