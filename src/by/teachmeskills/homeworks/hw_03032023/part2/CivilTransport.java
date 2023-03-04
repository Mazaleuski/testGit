package by.teachmeskills.homeworks.hw_03032023.part2;

public class CivilTransport extends AirTransport {
    private int numPassengers;
    private boolean businessClass;

    public CivilTransport(int power, int maxSpeed, int weight, String brand, int wingSpan, int minRunwayLength, int numPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, brand, wingSpan, minRunwayLength);
        this.numPassengers = numPassengers;
        this.businessClass = businessClass;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public void checkNumPassengers(int numPass) {
        System.out.println(numPassengers >= numPass ? "Пассажиры на борту." : "Вам нужен самолет побольше.");
    }

    @Override
    public String toString() {
        return "CivilTransport{" +
                "numPassengers=" + numPassengers +
                ", businessClass=" + businessClass +
                ", wingSpan=" + wingSpan +
                ", minRunwayLength=" + minRunwayLength +
                ", power=" + power +
                ", powerKiloWatts=" + powerKiloWatts(power) +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
}
