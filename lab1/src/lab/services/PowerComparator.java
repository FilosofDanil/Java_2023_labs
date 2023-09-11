package lab.services;

import lab.entities.Device;

import java.util.Comparator;

public class PowerComparator implements Comparator<Device> {
    @Override
    public int compare(Device d1, Device d2) {
        return (int) (d1.getInitialPower() - d2.getInitialPower());
    }
}
