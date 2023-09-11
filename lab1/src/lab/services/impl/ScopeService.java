package lab.services.impl;

import lab.entities.Device;
import lab.services.IService;

import java.util.List;

public class ScopeService implements IService {
    private int from;
    private int to;

    public ScopeService(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String doTask(List<Device> devices) {
        return "Filtered List: \n" + devices.stream().filter(device -> device.getInitialPower() < to && device.getInitialPower() > from).toList().toString() + "\n";
    }
}
