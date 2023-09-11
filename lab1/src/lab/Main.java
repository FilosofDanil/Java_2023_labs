package lab;

import lab.data.LabData;
import lab.services.IService;
import lab.services.impl.CalcService;
import lab.services.impl.ScopeService;
import lab.services.impl.SortService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        LabData data = LabData.getInstanse();
        List<IService> services = List.of(new CalcService(), new ScopeService(50, 100), new SortService());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Initial Data: \n" + data.getDevices().toString() + "\n");
        services.forEach(iService -> {
            String response = iService.doTask(data.getDevices());
            stringBuilder.append(response);
            stringBuilder.append("\n");
        });
        System.out.println("LAB1(6) Berkovskyi Danylo IA-11");
        System.out.println(stringBuilder.toString());
    }
}
