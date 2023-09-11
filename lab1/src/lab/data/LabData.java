package lab.data;

import lab.entities.Device;

import java.util.List;

public final class LabData {
    private static LabData instance;

    private final List<Device> devices = List.of();

    private LabData() {
    }

    public static LabData getIntanse() {
        if (instance == null) {
            instance = new LabData();
        }
        return instance;
    }

    public List<Device> getDevices() {
        return devices;
    }
}
