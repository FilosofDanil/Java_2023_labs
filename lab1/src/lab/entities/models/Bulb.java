package lab.entities.models;

public class Bulb {
    private final double powerMultiplier;

    public Bulb(double powerMultiplier) {
        if (powerMultiplier < 0) {
            throw new IllegalArgumentException("User entered wrong values");
        }
        this.powerMultiplier = powerMultiplier;
    }

    public double getPowerMultiplier() {
        return powerMultiplier;
    }

    @Override
    public String toString() {
        return "Bulb(kef): " + powerMultiplier;
    }
}
