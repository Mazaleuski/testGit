package by.teachmeskills.homeworks.hw_24022023;

public class Cell {
    public static void main(String[] args) {
        int[] hours = {3, 6, 9, 12, 15, 18, 21, 24};
        int amountCell;
        for (int i : hours) {
            amountCell = (int) Math.pow(2, i / 3);
            System.out.println(amountCell);
        }
    }
}
