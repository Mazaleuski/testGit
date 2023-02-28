package by.teachmeskills.homeworks.hw_03032023.part2;

public abstract class GroundTransport extends Transport {
    protected int numWheels;
    protected int fuelConsumption;

    public GroundTransport(int power, int maxSpeed, int weight, String brand, int numWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.numWheels = numWheels;
        this.fuelConsumption = fuelConsumption;
    }
}
