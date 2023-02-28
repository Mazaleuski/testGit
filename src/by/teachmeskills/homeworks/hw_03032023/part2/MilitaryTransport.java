package by.teachmeskills.homeworks.hw_03032023.part2;

public class MilitaryTransport extends AirTransport {
    private boolean ejection;
    private int numMissile;

    public MilitaryTransport(int power, int maxSpeed, int weight, String brand, int wingSpan, int minRunwayLength, boolean ejection, int numMissile) {
        super(power, maxSpeed, weight, brand, wingSpan, minRunwayLength);
        this.ejection = ejection;
        this.numMissile = numMissile;
    }

    public boolean isEjection() {
        return ejection;
    }

    public int getNumMissile() {
        return numMissile;
    }

    public void setEjection(boolean ejection) {
        this.ejection = ejection;
    }

    public void setNumMissile(int numMissile) {
        this.numMissile = numMissile;
    }

    @Override
    public String toString() {
        return "MilitaryTransport{" +
                "ejection=" + ejection +
                ", numMissile=" + numMissile +
                ", wingSpan=" + wingSpan +
                ", minRunwayLength=" + minRunwayLength +
                ", power=" + power +
                ", powerKiloWatts=" + powerKiloWatts(power) +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void shot() {
        System.out.println(numMissile > 0 ? "Ракета пошла." : "Боеприпасы отсутствуют.");
    }

    public void checkEjection() {
        System.out.println(ejection ? "Катапультирование прошло успешно." : "У Вас нет такой системы.");
    }

    private double powerKiloWatts(int power) {
        return 0.74 * power;
    }
}
