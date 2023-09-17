package lab.data;

import lab.entities.Device;
import lab.entities.impl.Kettle;
import lab.entities.impl.Lamp;
import lab.entities.impl.Laptop;
import lab.entities.models.Bulb;

import java.util.ArrayList;
import java.util.List;

public final class LabData {
    private static LabData instance;

    private final List<Device> devices;

    private LabData() {
        devices = List.of(new Laptop(250, false, ""),
                new Laptop(125.7, true, "working"),
                new Laptop(190.5, true, "playing"),
                new Laptop(140, false, ""),
                new Laptop(90, true, "surfing"),
                new Lamp(new Bulb(1), 50, false),
                new Lamp(new Bulb(1.25), 60.1, true),
                new Lamp(new Bulb(1.5), 35.7, false),
                new Lamp(new Bulb(0.7), 42.3, true),
                new Lamp(new Bulb(0.7), 70, true),
                new Kettle(60, true, 25),
                new Kettle(25.5, false, 0),
                new Kettle(38.9, true, 80),
                new Kettle(80.1, false, 10),
                new Kettle(90.1, true, 50));
    }

    public static LabData getInstanсe() {
        if (instance == null) {
            instance = new LabData();
        }
        return instance;
    }

    public List<Device> getDevices() {
        return devices;
    }
}
