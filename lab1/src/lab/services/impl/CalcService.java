package lab.services.impl;

import lab.entities.Device;
import lab.services.IService;

import java.util.List;

public class CalcService implements IService {

    @Override
    public String doTask(List<Device> devices) {
        double summaryPower = devices.stream().filter(Device::isInSocket).mapToDouble(Device::getInitialPower).sum();
        return "Summary power used (in Wt): \n" + summaryPower + "\n";
    }
}
