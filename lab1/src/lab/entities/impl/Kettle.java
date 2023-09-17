package lab.entities.impl;

import lab.entities.Device;

public class Kettle extends Device {
    private final Integer capacity;

    public Kettle(double initialPower, boolean inSocket, int capacity) {
        super(initialPower, inSocket);
        this.capacity = capacity;
    }

    @Override
    public double getConsumedPower(){
        return super.getInitialPower() * capacity / 100;
    }

    @Override
    public String toString() {
        return "\n Kettle " +
                "initialPower=" + super.getInitialPower();
    }
}
