package lab;

import lab.data.LabData;
import lab.entities.Device;
import lab.services.IService;
import lab.services.impl.CalcService;
import lab.services.impl.ScopeService;
import lab.services.impl.SortService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            LabData data = LabData.getInstanсe();
            List<IService> services = List.of(new CalcService(), new ScopeService(0, 100), new SortService());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Initial Data: \n" + data.getDevices().toString() + "\n");
            services.forEach(iService -> {
                ArrayList<Device> mutableList = new ArrayList<>(data.getDevices());
                String response = iService.doTask(mutableList);
                stringBuilder.append(response);
                stringBuilder.append("\n");
            });
            System.out.println("LAB1(6) Berkovskyi Danylo IA-11");
            System.out.println(stringBuilder);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
