package lab.entities;

public class Device {
    private double initialPower;

    private boolean inSocket;

    public Device(double initialPower) {
        this.initialPower = initialPower;
        this.inSocket = false;
    }

    public double getInitialPower() {
        return initialPower;
    }

    public void setInitialPower(double initialPower) {
        this.initialPower = initialPower;
    }

    public boolean isInSocket() {
        return inSocket;
    }

    public void turnInTheSocket() {
        this.inSocket = true;
    }
}
