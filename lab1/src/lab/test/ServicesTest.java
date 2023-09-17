package lab.test;

import lab.entities.Device;
import lab.entities.impl.Kettle;
import lab.entities.impl.Lamp;
import lab.entities.impl.Laptop;
import lab.entities.models.Bulb;
import lab.services.impl.CalcService;
import lab.services.impl.ScopeService;
import lab.services.impl.SortService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ServicesTest {
    private final List<Device> testDevicesList = List
            .of(new Kettle(50, true, 50),
                    new Kettle(25, false, 0),
                    new Laptop(100, true, "working"),
                    new Lamp(new Bulb(1.5), 60, true));

    @Test
    public void sortingServiceTest() {
        List<Device> mutableTestList = new ArrayList<>(testDevicesList);
        SortService sortService = new SortService();
        sortService.doTask(mutableTestList);
        for (int i = 0; i < mutableTestList.size() - 1; i++) {
            assert mutableTestList.get(i).getInitialPower() <= mutableTestList.get(i + 1).getInitialPower();
        }
    }

    @Test
    public void filtersServiceTest() {
        List<Device> mutableTestList = new ArrayList<>(testDevicesList);
        int from = 30;
        int to = 70;
        ScopeService scopeService = new ScopeService(from, to);
        scopeService.doTask(mutableTestList);
        List<Device> filteredList = scopeService.getFilteredList();
        for (Device device : filteredList) {
            assert device.getInitialPower() >= from;
            assert device.getInitialPower() <= to;
        }
    }

    @Test
    public void calculationServiceTest() {
        List<Device> mutableTestList = new ArrayList<>(testDevicesList);
        CalcService calcService = new CalcService();
        calcService.doTask(mutableTestList);
        assert calcService.getSummaryPower() == 215;
    }
}
