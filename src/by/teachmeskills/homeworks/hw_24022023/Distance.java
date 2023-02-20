package by.teachmeskills.homeworks.hw_24022023;

public class Distance {
    public static void main(String[] args) {
        double disDay = 10;
        double sumDis = disDay;
        for (int i = 2; i <= 7; i++) {
            disDay = disDay * 1.1;
            sumDis += disDay;
        }
        System.out.println("Суммарный путь за 7 дней равен : " + sumDis);
    }
}
