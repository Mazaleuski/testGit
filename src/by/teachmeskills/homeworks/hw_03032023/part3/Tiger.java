package by.teachmeskills.homeworks.hw_03032023.part3;

public class Tiger extends Feline {

    public Tiger(String picture, String food, int hungerLevel, Boundaries boundaries, Location location) {
        super(picture, food, hungerLevel, boundaries, location);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Rhrhr!");
    }

    @Override
    protected void eat() {
        System.out.println("Tiger eats meat...");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "picture='" + picture + '\'' +
                ", food='" + food + '\'' +
                ", hungerLevel=" + hungerLevel +
                ", boundaries=" + boundaries +
                ", location=" + location +
                '}';
    }
}
