package by.teachmeskills.homeworks.hw_03032023.part2;

public abstract class Transport {
    protected int power;
    protected int maxSpeed;
    protected int weight;
    protected String brand;

    public Transport(int power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    protected double powerKiloWatts(int power) {
        return 0.74 * power;
    }
}
