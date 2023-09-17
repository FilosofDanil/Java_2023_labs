package lab.services.impl;

import lab.entities.Device;
import lab.services.IService;

import java.util.List;

public class CalcService implements IService {
    private double summaryPower;

    @Override
    public String doTask(List<Device> devices) {
        summaryPower = devices.stream().filter(Device::isInSocket).mapToDouble(Device::getConsumedPower).sum();
        return "Summary power used (in Wt): \n" + summaryPower + "\n";
    }

    public double getSummaryPower() {
        return summaryPower;
    }
}
