package lab.entities.models;

public class Bulb {
    private final double powerMultiplier;

    public Bulb(double powerMultiplier) {
        this.powerMultiplier = powerMultiplier;
    }

    public double getPowerMultiplier() {
        return powerMultiplier;
    }
}
