package by.teachmeskills.homeworks.hw_03032023.part1.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Нога Sony делает шаг.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
