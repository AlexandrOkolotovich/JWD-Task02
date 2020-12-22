package by.jwd.task02.output;

import by.jwd.task02.entity.Appliance;

import java.util.Iterator;
import java.util.List;

public class PrintApplianceInfo {
    public static void print(List<Appliance> appliance){
        Iterator<Appliance> iterator = appliance.iterator();

        while (iterator.hasNext()){
            String applianceInfo = iterator.next().toString();

            System.out.println(applianceInfo);
        }
    }
}
