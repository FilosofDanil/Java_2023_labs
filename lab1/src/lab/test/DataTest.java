package lab.test;

import lab.data.LabData;
import lab.entities.Device;
import lab.entities.impl.Laptop;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DataTest {
    @Test
    public void initData(){
        LabData data = LabData.getInstanсe();
        assert data!=null;
    }

    @Test
    public void getListFromData(){
        LabData data = LabData.getInstanсe();
        List<Device> devices = new ArrayList<>(data.getDevices());
        Device laptop = new Laptop(100, true, "playing");
        devices.add(laptop);
        assert devices.contains(laptop);
        assert !data.getDevices().contains(laptop);
    }
}
