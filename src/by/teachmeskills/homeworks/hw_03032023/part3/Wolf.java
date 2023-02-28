package by.teachmeskills.homeworks.hw_03032023.part3;

public class Wolf extends Canine {
    public Wolf(String picture, String food, int hungerLevel, Boundaries boundaries, Location location) {
        super(picture, food, hungerLevel, boundaries, location);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Auf!");
    }

    @Override
    protected void eat() {
        System.out.println("Wolf eats meat...");
    }

    @Override
    protected void roam() {
        System.out.println("Wolf lives in a flock...");
    }

    @Override
    protected void getInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "picture='" + picture + '\'' +
                ", food='" + food + '\'' +
                ", hungerLevel=" + hungerLevel +
                ", boundaries=" + boundaries +
                ", location=" + location +
                '}';
    }
}
