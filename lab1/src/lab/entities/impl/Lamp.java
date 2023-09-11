package lab.entities.impl;

import lab.entities.Device;
import lab.entities.models.Bulb;

public class Lamp extends Device {
    private final Bulb bulb;

    public Lamp(Bulb bulb, double initialPower) {
        super(initialPower * bulb.getPowerMultiplier());
        this.bulb = bulb;
    }

    public Bulb getBulb() {
        return bulb;
    }
}
