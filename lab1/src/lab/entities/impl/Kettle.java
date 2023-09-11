package lab.entities.impl;

import lab.entities.Device;

public class Kettle extends Device {
    public Kettle(double initialPower, boolean inSocket) {
        super(initialPower, inSocket);
    }

    @Override
    public String toString() {
        return "Kettle " +
                "initialPower=" + super.getInitialPower() +
                " \n";
    }
}
