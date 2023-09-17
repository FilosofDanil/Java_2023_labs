package lab.entities.impl;

import lab.entities.Device;
import lab.entities.models.Bulb;

public class Lamp extends Device {
    private final Bulb bulb;

    public Lamp(Bulb bulb, double initialPower, boolean inSocket) {
        super(initialPower, inSocket);
        this.bulb = bulb;
    }

    @Override
    public double getConsumedPower(){
        return super.getInitialPower() * bulb.getPowerMultiplier();
    }

    @Override
    public String toString() {
        return "\n Lamp " +
                "initialPower=" + super.getInitialPower() + " " +
                bulb.toString();
    }
}
