package lab.entities;

public class Device {
    private int initialPower;

    private boolean inSocket;

    public Device(int initialPower) {
        this.initialPower = initialPower;
        this.inSocket = false;
    }

    public int getInitialPower() {
        return initialPower;
    }

    public void setInitialPower(int initialPower) {
        this.initialPower = initialPower;
    }

    public boolean isInSocket() {
        return inSocket;
    }

    public void turnInTheSocket() {
        this.inSocket = true;
    }
}
