package by.teachmeskills.homeworks.hw_03032023.part2;

public abstract class AirTransport extends Transport {
    protected int wingSpan;
    protected int minRunwayLength;

    public AirTransport(int power, int maxSpeed, int weight, String brand, int wingSpan, int minRunwayLength) {
        super(power, maxSpeed, weight, brand);
        this.wingSpan = wingSpan;
        this.minRunwayLength = minRunwayLength;
    }
}
