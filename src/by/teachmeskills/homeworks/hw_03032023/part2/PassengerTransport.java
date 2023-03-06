package by.teachmeskills.homeworks.hw_03032023.part2;

public class PassengerTransport extends GroundTransport {
    private String bodyType;
    private int numPassengers;
    private double way;

    public PassengerTransport(int power, int maxSpeed, int weight, String brand, int numWheels, int fuelConsumption, String bodyType, int numPassengers) {
        super(power, maxSpeed, weight, brand, numWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numPassengers = numPassengers;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public void maxWay(int hours) {
        way = hours * maxSpeed;
        System.out.printf("За время %d часа, автомобиль %s, двигаясь с максимальной скоростью %d км/ч, " +
                "проедет %.1f км и израсходует %.1f литров топлива.\n", hours, brand, maxSpeed, way, fuelCalculation());
    }

    private double fuelCalculation() {
        return way / 100 * fuelConsumption;
    }

    @Override
    public String toString() {
        return "PassengerTransport{" +
                "bodyType='" + bodyType + '\'' +
                ", numPassengers=" + numPassengers +
                ", way=" + way +
                ", numWheels=" + numWheels +
                ", fuelConsumption=" + fuelConsumption +
                ", power=" + power +
                ", powerKiloWatts=" + powerKiloWatts(power) +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
}
