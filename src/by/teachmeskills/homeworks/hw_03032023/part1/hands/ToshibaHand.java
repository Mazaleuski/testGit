package by.teachmeskills.homeworks.hw_03032023.part1.hands;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднята рука Toshiba.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
