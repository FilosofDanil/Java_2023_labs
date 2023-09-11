package lab.entities;

public class Device {
    private double initialPower;

    private boolean inSocket;

    public Device(double initialPower, boolean inSocket) {
        this.initialPower = initialPower;
        this.inSocket = inSocket;
    }

    public double getInitialPower() {
        return initialPower;
    }

    public boolean isInSocket() {
        return inSocket;
    }
}
