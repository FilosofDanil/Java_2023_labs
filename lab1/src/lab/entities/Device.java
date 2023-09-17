package lab.entities;

public class Device {
    private final double initialPower;

    private final boolean inSocket;

    public Device(double initialPower, boolean inSocket) {
        if(initialPower < 0) throw  new IllegalArgumentException("User entered wrong values");

        this.initialPower = initialPower;
        this.inSocket = inSocket;
    }

    public double getInitialPower() {
        return initialPower;
    }

    public double getConsumedPower() {
        return initialPower;
    }

    public boolean isInSocket() {
        return inSocket;
    }
}
