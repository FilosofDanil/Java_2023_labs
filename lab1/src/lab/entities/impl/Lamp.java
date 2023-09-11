package lab.entities.impl;

import lab.entities.Device;
import lab.entities.models.Bulb;

public class Lamp extends Device {
    private final Bulb bulb;

    public Lamp(Bulb bulb, double initialPower, boolean inSocket) {
        super(initialPower * bulb.getPowerMultiplier(), inSocket);
        this.bulb = bulb;
    }

    public Bulb getBulb() {
        return bulb;
    }

    @Override
    public String toString() {
        return "Lamp " +
                "initialPower=" + super.getInitialPower() +
                " \n";
    }
}
