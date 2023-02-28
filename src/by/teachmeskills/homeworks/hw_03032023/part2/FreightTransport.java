package by.teachmeskills.homeworks.hw_03032023.part2;

public class FreightTransport extends GroundTransport {
    private int loadCapacity;

    public FreightTransport(int power, int maxSpeed, int weight, String brand, int numWheels, int fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, weight, brand, numWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "FreightTransport{" +
                "loadCapacity=" + loadCapacity +
                ", numWheels=" + numWheels +
                ", fuelConsumption=" + fuelConsumption +
                ", power=" + power +
                ", powerKiloWatts=" + powerKiloWatts(power) +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void checkLoadCapacity(int cargo) {
        System.out.println(loadCapacity >= cargo ? "Грузовик загружен." : "Вам нужен грузовик побольше.");
    }

    private double powerKiloWatts(int power) {
        return 0.74 * power;
    }
}
