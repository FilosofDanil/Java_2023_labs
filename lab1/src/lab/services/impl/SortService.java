package lab.services.impl;

import lab.entities.Device;
import lab.services.IService;
import lab.services.PowerComparator;

import java.util.Collections;
import java.util.List;

public class SortService implements IService {

    @Override
    public String doTask(List<Device> devices){
        Collections.sort(devices, new PowerComparator());
        return "Sorted list: \n" + devices.toString() + "\n";
    }
}
