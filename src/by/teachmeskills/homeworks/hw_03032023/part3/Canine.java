package by.teachmeskills.homeworks.hw_03032023.part3;

public abstract class Canine extends Animal {
    public Canine(String picture, String food, int hungerLevel, Boundaries boundaries, Location location) {
        super(picture, food, hungerLevel, boundaries, location);
    }

    @Override
    protected void roam() {
        System.out.println("Canine lives in a flock...");
    }
}
