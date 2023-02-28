package by.teachmeskills.homeworks.hw_03032023.part1.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Нога Toshiba делает шаг.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
